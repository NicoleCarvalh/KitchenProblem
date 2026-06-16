package com.bytesMenu.repository;

import com.bytesMenu.entity.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PratoRepository extends JpaRepository<Prato, Long> {
    List<Prato> findByDisponivel(Boolean disponivel);
}
