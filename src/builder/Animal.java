package builder;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Animal {
    String nome;
    String raça;
    String personalidade;
    String idade;
}
