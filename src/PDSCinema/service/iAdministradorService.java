package PDSCinema.service;

import PDSCinema.model.*;
import PDSCinema.repository.CinemaRepository;


import java.io.IOException;
import java.util.ArrayList;

public interface iAdministradorService {
    void cadastrarFilmes(CinemaRepository cinema, String name, int duracao, String sinopse, String classificacaoIndicativa, String genero,
                         String diaDeEstreia);
    void cadastrarCupons(String _Cupom, String tipoDeCupom);
    void cadastrarPremios(String descricao);

    Filme buscarFilme(CinemaRepository cinema, String nome) throws IOException;
    ArrayList<Filme> buscarFilmeGenero(CinemaRepository cinema, String genero) throws IOException;
    Cupom buscarCupons(String codigo);
    Premio buscarPremio(String codigo);

    int removerFilmes(CinemaRepository cinema, Filme filme) throws IOException;
    int removerCupons(Cupom cupom, Cliente cliente);
    int removerPremios(Premio premio, Cliente cliente);
}
