package ifsc.sti.tcc.resources.mappers.viewtodomain;

import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.utilidades.ValidateUtil;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class CadastroMapper extends MapperUtil<UsuarioRequest, Usuario> {

	@Override
	public Usuario transform(UsuarioRequest aObject) {
		Usuario usuario = new Usuario();
		usuario.setCpf(ValidateUtil.unmask(aObject.getCpf()));
		usuario.setEmail(aObject.getEmail());
		usuario.setFone(ValidateUtil.unmask(aObject.getFone()));
		usuario.setNascimento(aObject.getNascimento());
		usuario.setNome(aObject.getNome());
		usuario.setSenha(aObject.getSenha());
		return usuario;
	}


}