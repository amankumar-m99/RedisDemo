package m99.redisdemo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Serializable {

	private static final long serialVersionUID = -8268543477907583425L;

	private Integer stdId;
	private String stdName;
	private Double stdFee;
}
