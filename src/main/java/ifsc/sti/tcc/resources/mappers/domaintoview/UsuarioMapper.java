package ifsc.sti.tcc.resources.mappers.domaintoview;

import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.UsuarioBaseResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class UsuarioMapper extends MapperUtil<Usuario, UsuarioBaseResponse> {

	@Override
	public UsuarioBaseResponse transform(Usuario aObject) {
		UsuarioBaseResponse alunoResponse = new UsuarioBaseResponse();
		alunoResponse.setId(aObject.getId());
		alunoResponse.setCpf(aObject.getCpf());
		alunoResponse.setEmail(aObject.getEmail());
		alunoResponse.setFone(aObject.getFone());
		alunoResponse.setNascimento(aObject.getNascimento());
		alunoResponse.setNome(aObject.getNome());
		return alunoResponse;
	}

}