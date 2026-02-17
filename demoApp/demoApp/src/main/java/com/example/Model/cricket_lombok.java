package com.example.Model;
import lombok.*;
//The use of Lombok is to avoid writing repeated code.
//It automatically generates common methods like:
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode

public class cricket_lombok {
    private int TeamId;
    private int noofPlayers;
    private String TeamName;
}
