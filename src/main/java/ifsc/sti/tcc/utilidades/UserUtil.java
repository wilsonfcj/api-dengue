package ifsc.sti.tcc.utilidades;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.usuario.Usuario;

public class UserUtil {
	
	public static List<Usuario> criarUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario aluno1 = new Usuario();
		aluno1.setCpf("09518747997");
		aluno1.setFone("49988810393");
		aluno1.setEmail("wilsonfernandes382@gmail.com");
		aluno1.setNome("Wilson Fernandes Cordova Junior");
		aluno1.setNascimento(DateUtil.criarData(23, 10, 1995));
		aluno1.setSenha("123456");
		aluno1.setId(1l);
		

		Usuario aluno2 = new Usuario();
		aluno2.setCpf("41643824066");
		aluno2.setFone("49988566008");
		aluno2.setEmail("correiaribeirotiago@gmail.com");
		aluno2.setNome("Tiago Correia Ribeiro");
		aluno2.setNascimento(DateUtil.criarData(11, 01, 1999));
		aluno2.setSenha("123456");
		aluno2.setId(2l);
		
		usuarios.add(aluno1);
		usuarios.add(aluno2);

		return usuarios;
	}
	
	public static Usuario buscarUsuarioCPF(String cpf) {
		for (Usuario usuario : criarUsuarios()) {
			if(usuario.getCpf().equalsIgnoreCase(cpf)) {
				return usuario;
			}
		}
		return null;
	}
	
}
