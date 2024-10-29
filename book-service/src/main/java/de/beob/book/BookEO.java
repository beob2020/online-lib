package de.beob.book;


import de.beob.book.dtos.BookGenre;
import de.beob.book.dtos.EnumBooKStatus;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "books")
public class BookEO  extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private EnumBooKStatus status;
    private BookGenre genre;
    private String Json;
}
