package net.jonathan.cadastro_de_trecos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Tools {

    public static void showRes(ResultSet res) {
        try {
            System.out.println(
                    "ID: " + res.getString("id") + "\n"
                    + "  Nome: " + res.getString("nome") + "\n"
                    + "  Descrição: " + res.getString("descricao") + "\n"
                    + "  Localização: " + res.getString("localizacao") + "\n"
                    + "  Data: " + res.getString("databr") + "\n"
                   
            );
        } catch (SQLException error) {

            // Tratamento de erros.
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }

    }
    
                

}
