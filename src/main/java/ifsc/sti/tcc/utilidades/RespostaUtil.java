package ifsc.sti.tcc.utilidades;

public class RespostaUtil {

//	public static RespostaSimuladoRequest gerarRepostaUtil(Usuario usuario, Simulado simulado) {
//	
//		RespostaSimuladoRequest respostaSimulado = new RespostaSimuladoRequest();
//		respostaSimulado.setIdUsuario(usuario.getId());
//		respostaSimulado.setIdSimulado(simulado.getId());
//	
//		List<RespostaQuestaoRequest> respostaQuestoes = new ArrayList<>();
//		
//		RespostaQuestaoRequest respostaQuestao = new RespostaQuestaoRequest();
//		respostaQuestao.setIdQuestao(3l);
//		respostaQuestao.setRespostaQuestao("b");
//		respostaQuestao.setRespondida(true);
//		respostaQuestao.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao1 = new RespostaQuestaoRequest();
//		respostaQuestao1.setIdQuestao(1l);
//		respostaQuestao1.setRespostaQuestao("a");
//		respostaQuestao1.setRespondida(true);
//		respostaQuestao1.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao2 = new RespostaQuestaoRequest();
//		respostaQuestao2.setIdQuestao(11l);
//		respostaQuestao2.setRespostaQuestao("e");
//		respostaQuestao2.setRespondida(true);
//		respostaQuestao2.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao3 = new RespostaQuestaoRequest();
//		respostaQuestao3.setIdQuestao(9l);
//		respostaQuestao3.setRespostaQuestao("b");
//		respostaQuestao3.setRespondida(true);
//		respostaQuestao3.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao4 = new RespostaQuestaoRequest();
//		respostaQuestao4.setIdQuestao(8l);
//		respostaQuestao4.setRespostaQuestao("b");
//		respostaQuestao4.setRespondida(true);
//		respostaQuestao4.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
////		------------------------------------------------------
//		
//		RespostaQuestaoRequest respostaQuestao5 = new RespostaQuestaoRequest();
//		respostaQuestao5.setIdQuestao(40l);
//		respostaQuestao5.setRespostaQuestao("c");
//		respostaQuestao5.setRespondida(true);
//		respostaQuestao5.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao6 = new RespostaQuestaoRequest();
//		respostaQuestao6.setIdQuestao(31l);
//		respostaQuestao6.setRespostaQuestao("d");
//		respostaQuestao6.setRespondida(true);
//		respostaQuestao6.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao7 = new RespostaQuestaoRequest();
//		respostaQuestao7.setIdQuestao(26l);
//		respostaQuestao7.setRespostaQuestao("c");
//		respostaQuestao7.setRespondida(true);
//		respostaQuestao7.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao8 = new RespostaQuestaoRequest();
//		respostaQuestao8.setIdQuestao(32l);
//		respostaQuestao8.setRespostaQuestao("e");
//		respostaQuestao8.setRespondida(true);
//		respostaQuestao8.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao9 = new RespostaQuestaoRequest();
//		respostaQuestao9.setIdQuestao(30l);
//		respostaQuestao9.setRespostaQuestao("b");
//		respostaQuestao9.setRespondida(true);
//		respostaQuestao9.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
////		------------------------------------------------------	
//		
//		RespostaQuestaoRequest respostaQuestao10 = new RespostaQuestaoRequest();
//		respostaQuestao10.setIdQuestao(58l);
//		respostaQuestao10.setRespostaQuestao("a");
//		respostaQuestao10.setRespondida(true);
//		respostaQuestao10.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao11 = new RespostaQuestaoRequest();
//		respostaQuestao11.setIdQuestao(47l);
//		respostaQuestao11.setRespostaQuestao("d");
//		respostaQuestao11.setRespondida(true);
//		respostaQuestao11.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao12 = new RespostaQuestaoRequest();
//		respostaQuestao12.setIdQuestao(50l);
//		respostaQuestao12.setRespostaQuestao("e");
//		respostaQuestao12.setRespondida(true);
//		respostaQuestao12.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao13 = new RespostaQuestaoRequest();
//		respostaQuestao13.setIdQuestao(67l);
//		respostaQuestao13.setRespostaQuestao("d");
//		respostaQuestao13.setRespondida(true);
//		respostaQuestao13.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		RespostaQuestaoRequest respostaQuestao14 = new RespostaQuestaoRequest();
//		respostaQuestao14.setIdQuestao(51l);
//		respostaQuestao14.setRespostaQuestao("b");
//		respostaQuestao14.setRespondida(true);
//		respostaQuestao14.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
//		
//		respostaQuestoes.add(respostaQuestao);
//		respostaQuestoes.add(respostaQuestao1);
//		respostaQuestoes.add(respostaQuestao2);
//		respostaQuestoes.add(respostaQuestao3);
//		respostaQuestoes.add(respostaQuestao4);
//		respostaQuestoes.add(respostaQuestao5);
//		respostaQuestoes.add(respostaQuestao6);
//		respostaQuestoes.add(respostaQuestao7);
//		respostaQuestoes.add(respostaQuestao8);
//		respostaQuestoes.add(respostaQuestao9);
//		respostaQuestoes.add(respostaQuestao10);
//		respostaQuestoes.add(respostaQuestao11);
//		respostaQuestoes.add(respostaQuestao12);
//		respostaQuestoes.add(respostaQuestao13);
//		respostaQuestoes.add(respostaQuestao14);
//		
//		respostaSimulado.setRespostas(respostaQuestoes);
//		
//		return respostaSimulado;
//	}
}
