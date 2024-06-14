package br.com.omnilink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.omnilink.utils.Log;

import java.io.File;

@SpringBootApplication
public class APIOmnilinkAvaliacao {

    
    public static void main(String[] args) {
        File f = new File(Log.getDiretorioLogs());
        if (!f.exists()) {
            f.mkdir();
        }

        SpringApplication.run(APIOmnilinkAvaliacao.class, args);
    }

}
