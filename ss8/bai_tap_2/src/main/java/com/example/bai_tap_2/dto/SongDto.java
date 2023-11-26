package com.example.bai_tap_2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SongDto {
    private int id;
    @NotEmpty(message = "Please do not leave it blank")
    @Size(max = 800,message = "Tối đa 800 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9]{1,}$",message = "Không được nhập kí tự đặc biệt")
    private String nameSong;
    @NotEmpty
    @Size(max = 300,message = "Tối đa 300 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9]{1,}$",message = "Không được nhập kí tự đặc biệt")
    private String singer;
    @NotEmpty
    @Size(max = 1000,message = "Tối đa 1000 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\\\,]{1,}$",message = "Không được nhập kí tự đặc biệt")
    private String typeOfMusic;
}
