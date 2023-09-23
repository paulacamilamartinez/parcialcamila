package com.usta.parcial.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "Nombre")
@Data
public class NombreEntity implements Serializable {

        @Serial
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_nombre")
        private  Long id_nombre;
        @NotNull
        @Column(name = "nombre")
        @Size(min = 1, max = 30)
        private String nombre;
}
