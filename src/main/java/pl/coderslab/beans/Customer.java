package pl.coderslab.beans;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
}
