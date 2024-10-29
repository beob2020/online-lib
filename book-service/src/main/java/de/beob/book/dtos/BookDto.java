package de.beob.book.dtos;


import de.beob.book.BookEO;
import io.quarkus.arc.All;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookDto {


    private EnumBooKStatus status;
    private BookGenre genre;

    public static List<BookDto> mapToDto(List<BookEO> bookEOS) {
        return bookEOS.stream()
                .map(bookEO -> new BookDto(
                        bookEO.getStatus(),
                        bookEO.getGenre()
                ))
                .collect(Collectors.toList());
    }
}
