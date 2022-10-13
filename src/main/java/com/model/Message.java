package com.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "message")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String messageHeader;

    private String messageText;

    
}
