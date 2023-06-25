package com.backendlabtime.projeto.service;

import com.backendlabtime.projeto.entity.Usuario;
import com.backendlabtime.projeto.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService {

    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> findByNomeCompletoContainingIgnoreCaseOrNomeSocialContainingIgnoreCaseOrEmailContainingIgnoreCase(String nomeCompleto,
                                                                                                                           String nomeSocial,
                                                                                                                           String email){
        return usuarioRepository.findByNomeCompletoContainingIgnoreCaseOrNomeSocialContainingIgnoreCaseOrEmailContainingIgnoreCase(
                nomeCompleto,
                nomeSocial,
                email);

        }

    @Transactional
    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    public void update(Usuario usuario) {

    }

    public void readCSVAndSaveToDatabase() throws IOException, CsvException{
        try (CSVReader csvreader = new CSVReader(new FileReader("usuarios.csv"))) {
            List<String[]> lines = csvreader.readAll();
            List<Usuario> usuarioList = new ArrayList<>();

            // pula a primeira linha
            lines.remove(0);

            for (String[] line : lines) {
                Usuario usuario = new Usuario();
                usuario.setNomeCompleto(line[0]);
                usuario.setNomeSocial(line[1]);
                usuario.setDataDeNascimento(line[2]);
                usuario.setCodigo(Integer.parseInt(line[3]));
                usuario.setSexo(line[4]);
                usuario.setEmail(line[5]);
                usuario.setEstado(line[6]);
                usuario.setMunicipio(line[7]);
                usuario.setNumeroDeAcessosAoCurso(Integer.parseInt(line[8]));
                usuario.setSituacaoNoCurso(line[9]);
                usuario.setDataDeVinculo(line[10]);

                usuarioList.add(usuario);
            }

            usuarioRepository.saveAll(usuarioList);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
