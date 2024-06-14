package br.com.omnilink.model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import static java.time.format.DateTimeFormatter.ofPattern;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Wilson.Souza
 */
@Data
@Entity
@Table(name = "omnilink.dbo.documentos")
public class Documentos implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String tipo_documento;
    private String descricao;
    private String data_created = ZonedDateTime.now().format(ofPattern("yyyy-MM-dd HH:mm:ss"));
    private String data_updated;
    
    private Long beneficiario_id;
}
