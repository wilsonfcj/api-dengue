package ifsc.sti.tcc.resources.mappers.viewtodomain;

import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.utilidades.mappers.MapperUpdateUtil;

public class AlterarMapper extends MapperUpdateUtil<UsuarioRequest, Usuario> {

	@Override
	public Usuario transform(UsuarioRequest aObject) {
		Usuario usuario = new Usuario();
		usuario.setCpf(aObject.getCpf());
		usuario.setEmail(aObject.getEmail());
		usuario.setFone(aObject.getFone().replace("(", "").replace(")", "").replace("-", "").trim());
		usuario.setNascimento(aObject.getNascimento());
		usuario.setNome(aObject.getNome());
		usuario.setSenha(aObject.getSenha());
		return usuario;
	}

	@Override
	public Usuario transform(Usuario aObject, UsuarioRequest aObject2) {
		aObject.setNome(aObject2.getNome());
		aObject.setEmail(aObject2.getEmail());
		aObject.setFone(aObject2.getFone().replace("(", "").replace(")", "").replace("-", "").trim());
		aObject.setNascimento(aObject2.getNascimento());
		aObject.setSenha(aObject2.getSenha());
		return aObject;
	}


}