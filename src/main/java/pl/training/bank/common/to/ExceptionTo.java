package pl.training.bank.common.to;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "exception")
@AllArgsConstructor
@Data
public class ExceptionTo {

    private String description;

}
