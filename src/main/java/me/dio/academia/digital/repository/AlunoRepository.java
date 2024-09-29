package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    //Para criar uma consulta avançada(Pela data de nascimento)
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);

    //Para criar uma consulta avançada(Pelo nome do bairro)
    List<Aluno> findByBairro(String bairro);
}
