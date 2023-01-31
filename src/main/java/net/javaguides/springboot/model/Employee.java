package net.javaguides.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "data_handphone")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "merk_hp")
    private String merkHp;

    @Column(name = "spesifikasi_hp")
    private String spesifikasiHp;

    @Column(name = "harga_hp")
    private String hargaHp;

    @Column(name = "tanggal_rilis")
    private String tanggalRilis;
}
