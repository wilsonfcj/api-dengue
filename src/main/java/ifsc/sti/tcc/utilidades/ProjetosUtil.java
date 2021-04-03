package ifsc.sti.tcc.utilidades;

public class ProjetosUtil {

	/*public static List<Projeto> criarProjetos() {
		List<Projeto> listProjetos = new ArrayList<>();

		Projeto lProjeto = new Projeto();
		lProjeto.setCodigo("PVLGS1135-2019");
		lProjeto.setTitulo(
				"Desenvolvimento de um aplicativo para o ensino e aprendizagem e produtos notáveis e polinômios");
		lProjeto.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto.setCategoria("Pesquisa aplicada");
		lProjeto.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto.setEmailCoordenador("ailton.durigon@ifsc.edu.br");
		lProjeto.setCoordenador("AILTON DURIGON");
		lProjeto.setDataCadastro(DateUtil.criarData(10, 4, 2019));
		listProjetos.add(lProjeto);

		Projeto lProjeto2 = new Projeto();
		lProjeto2.setCodigo("PILGS1345-2019");
		lProjeto2.setTitulo("Um software web para o estudo de Números e Operações");
		lProjeto2.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto2.setCategoria("Pesquisa aplicada");
		lProjeto2.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto2.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto2.setEmailCoordenador("ailton.durigon@ifsc.edu.br");
		lProjeto2.setCoordenador("AILTON DURIGON");
		lProjeto2.setDataCadastro(DateUtil.criarData(4, 11, 2019));
		listProjetos.add(lProjeto2);

		Projeto lProjeto3 = new Projeto();
		lProjeto3.setCodigo("PILGS1234-2019");
		lProjeto3.setTitulo("Guia de qualidade para provedores de serviços web");
		lProjeto3.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto3.setCategoria("Pesquisa aplicada");
		lProjeto3.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto3.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto3.setEmailCoordenador("alexandre.perin@ifsc.edu.br");
		lProjeto3.setCoordenador("ALEXANDRE PERIN DE SOUZA");
		lProjeto3.setDataCadastro(DateUtil.criarData(7, 8, 2019));
		listProjetos.add(lProjeto3);

		Projeto lProjeto4 = new Projeto();
		lProjeto4.setCodigo("PILGS1016-2019");
		lProjeto4.setTitulo("Demandas de Aprendizagem de Inglês no IFSC-câmpus Lages");
		lProjeto4.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto4.setCategoria("Pesquisa aplicada");
		lProjeto4.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto4
				.setArea("COORDENADORIA DO CURSO TECNICO EM INFORMATICA PARA INTERNET (CAMPUS LAGES) (11.01.21.02.20)");
		lProjeto4.setEmailCoordenador("luciane.oliveira@ifsc.edu.br");
		lProjeto4.setCoordenador("ANA MARIA MARTINS ROEBER");
		lProjeto4.setDataCadastro(DateUtil.criarData(27, 3, 2019));
		listProjetos.add(lProjeto4);

		Projeto lProjeto5 = new Projeto();
		lProjeto5.setCodigo("PILGS957-2019");
		lProjeto5.setTitulo(
				"Utilização do planejamento Simplex-Centróide para o desenvolvimento de polímeros biodegradáveis para armazenamento de alimentos: otimização das propriedades físico-químicas e antioxidantes.");
		lProjeto5.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto5.setCategoria("Pesquisa aplicada");
		lProjeto5.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto5.setArea("COORDENADORIA DE CURSOS TÉCNICOS DE BIOTECNOLOGIA (CAMPUS LAGES) (11.01.21.02.01)");
		lProjeto5.setEmailCoordenador("ana.veeck@ifsc.edu.br | anaveeck@yahoo.com.br");
		lProjeto5.setCoordenador("ANA PAULA DE LIMA VEECK");
		lProjeto5.setDataCadastro(DateUtil.criarData(16, 3, 2019));
		listProjetos.add(lProjeto5);

		Projeto lProjeto6 = new Projeto();
		lProjeto6.setCodigo("PILGS1051-2019");
		lProjeto6.setTitulo(
				"Síntese verde de nanopartículas de prata para aplicação em biopolímeros: desenvolvimento de uma embalagem bioativa, biodegradável e inteligente para a conservação de alimentos.");
		lProjeto6.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto6.setCategoria("Pesquisa aplicada");
		lProjeto6.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto6.setArea("COORDENADORIA DE CURSOS TÉCNICOS DE BIOTECNOLOGIA (CAMPUS LAGES) (11.01.21.02.01)");
		lProjeto6.setEmailCoordenador("ana.veeck@ifsc.edu.br | anaveeck@yahoo.com.br");
		lProjeto6.setCoordenador("ANA PAULA DE LIMA VEECK");
		lProjeto6.setDataCadastro(DateUtil.criarData(9, 4, 2019));
		listProjetos.add(lProjeto6);

		Projeto lProjeto7 = new Projeto();
		lProjeto7.setCodigo("PILGS1325-2019");
		lProjeto7.setTitulo("Bancada didática para aferição de esforços multidirecionais");
		lProjeto7.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto7.setCategoria("Desenvolvimento tecnológico e inovação");
		lProjeto7.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto7.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto7.setEmailCoordenador("anderson.correia@ifsc.edu.br");
		lProjeto7.setCoordenador("ANDERSON LUIS GARCIA CORREIA");
		lProjeto7.setDataCadastro(DateUtil.criarData(9, 4, 2019));
		listProjetos.add(lProjeto7);

		Projeto lProjeto8 = new Projeto();
		lProjeto8.setCodigo("PILGS1309-2019");
		lProjeto8.setTitulo("Construção de módulos educacionais para eletrônica");
		lProjeto8.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto8.setCategoria("Desenvolvimento tecnológico e inovação");
		lProjeto8.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto8.setArea("COORDENADORIA EM MECATRONICA (CAMPUS LAGES) (11.01.21.02.12)");
		lProjeto8.setEmailCoordenador("anderson.borges@ifsc.edu.br");
		lProjeto8.setCoordenador("ANDERSON WILLIAM SIMOES BORGES");
		lProjeto8.setDataCadastro(DateUtil.criarData(24, 10, 2019));
		listProjetos.add(lProjeto8);

		Projeto lProjeto9 = new Projeto();
		lProjeto9.setCodigo("PILGS1446-2019");
		lProjeto9.setTitulo("Desenvolvimento e Fabricação de máquina Chaveteira Vertical.");
		lProjeto9.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto9.setCategoria("Pesquisa aplicada");
		lProjeto9.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto9.setArea("COORDENADORIA DOS CURSOS TÉCNICOS DE ELETROMECÂNICA (CAMPUS LAGES) (11.01.21.02.07)");
		lProjeto9.setEmailCoordenador("ariton.araldi@ifsc.edu.br | ariton.araldi@gmail.com");
		lProjeto9.setCoordenador("ARITON ARALDI");
		lProjeto9.setDataCadastro(DateUtil.criarData(12, 11, 2019));
		listProjetos.add(lProjeto9);

		Projeto lProjeto10 = new Projeto();
		lProjeto10.setCodigo("PILGS1068-2019");
		lProjeto10.setTitulo(
				"Métodos Computacionais baseados em Inteligência Artificial para a Predição de Risco de Evasão de Alunos no Instituto Federal de Santa Catarina.");
		lProjeto10.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto10.setCategoria("Pesquisa aplicada");
		lProjeto10.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto10
				.setArea("COORDENADORIA DO CURSO TECNICO EM INFORMATICA PARA INTERNET (CAMPUS LAGES) (11.01.21.02.20)");
		lProjeto10.setEmailCoordenador("andres.ferrero@ifsc.edu.br | anfer86@gmail.com");
		lProjeto10.setCoordenador("CARLOS ANDRES FERRERO");
		lProjeto10.setDataCadastro(DateUtil.criarData(9, 4, 2019));
		listProjetos.add(lProjeto10);

		Projeto lProjeto11 = new Projeto();
		lProjeto11.setCodigo("PILGS1461-2019");
		lProjeto11.setTitulo(
				"Estruturação do laboratório de Física: provisão de equipamentos simples e kits básicos para a experimentação em ensino de física.");
		lProjeto11.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto11.setCategoria("Pesquisa aplicada");
		lProjeto11.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto11.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto11.setEmailCoordenador("eliana.borragini@ifsc.edu.br | efborragini@gmail.com");
		lProjeto11.setCoordenador("ELIANA FERNANDES BORRAGINI");
		lProjeto11.setDataCadastro(DateUtil.criarData(13, 11, 2019));
		listProjetos.add(lProjeto11);

		Projeto lProjeto12 = new Projeto();
		lProjeto12.setCodigo("PILGS1279-2019");
		lProjeto12.setTitulo(
				"DEFINIÇÃO DE CURVA ÓTIMA PARA GEOMETRIA DE PROPULSOR A JATO DE BOCAL DIVERGENTE CONVERGENTE COM COMBUSTÍVEIS GASOSOS.");
		lProjeto12.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto12.setCategoria("Pesquisa aplicada");
		lProjeto12.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto12.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto12.setEmailCoordenador("fernando.osorio@ifsc.edu.br");
		lProjeto12.setCoordenador("FERNANDO DA SILVA OSÓRIO");
		lProjeto12.setDataCadastro(DateUtil.criarData(29, 9, 2019));
		listProjetos.add(lProjeto12);

		Projeto lProjeto13 = new Projeto();
		lProjeto13.setCodigo("PILGS1333-2019");
		lProjeto13.setTitulo(
				"CONSTRUÇÃO DE BANCADA DIDÁTICA MÁQUINAS DE FLUXO, TURBOMÁQUINAS E TÉCNICAS DE MEDIÇÃO DE VAZÃO PARA FLUIDOS.");
		lProjeto13.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto13.setCategoria("Pesquisa aplicada");
		lProjeto13.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto13.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto13.setEmailCoordenador("fernando.osorio@ifsc.edu.br");
		lProjeto13.setCoordenador("FERNANDO DA SILVA OSÓRIO");
		lProjeto13.setDataCadastro(DateUtil.criarData(28, 10, 2019));
		listProjetos.add(lProjeto13);

		Projeto lProjeto14 = new Projeto();
		lProjeto14.setCodigo("PILGS1308-2019");
		lProjeto14.setTitulo(
				"ADEQUAÇÃO INDUSTRIAL DAS BAIAS DIDÁTICAS DE ENSINO DE INSTALAÇÕES ELÉTRICAS RESIDENCIAIS E PREDIAIS");
		lProjeto14.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto14.setCategoria("Desenvolvimento tecnológico e inovação");
		lProjeto14.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto14.setArea("COORDENADORIA DOS CURSOS TÉCNICOS DE ELETROMECÂNICA (CAMPUS LAGES) (11.01.21.02.07)");
		lProjeto14.setEmailCoordenador("gabriel.madruga@ifsc.edu.b | ggmadruga@gmail.com");
		lProjeto14.setCoordenador("GABRIEL GRANZOTTO MADRUGA");
		lProjeto14.setDataCadastro(DateUtil.criarData(24, 10, 2019));
		listProjetos.add(lProjeto14);

		Projeto lProjeto15 = new Projeto();
		lProjeto15.setCodigo("PILGS1212-2019");
		lProjeto15.setTitulo("Atividade fotocatalítica de TiO2 dopado com mangânes e imobilizado em carvão ativado");
		lProjeto15.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto15.setCategoria("Pesquisa aplicada");
		lProjeto15.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto15.setArea(
				"OORDENADORIA DO CURSO SUPERIOR DE TECNOLOGIA EM PROCESSOS QUÍMICOS (CAMPUS LAGES) (11.01.21.02.16)");
		lProjeto15.setEmailCoordenador("jaqueline.suave@ifsc.edu.br");
		lProjeto15.setCoordenador("JAQUELINE SUAVE");
		lProjeto15.setDataCadastro(DateUtil.criarData(5, 7, 2019));
		listProjetos.add(lProjeto15);

		Projeto lProjeto16 = new Projeto();
		lProjeto16.setCodigo("PILGS944-2019");
		lProjeto16.setTitulo(
				"Avaliação do efeito crioprotetor de hidrolisados proteicos do colágeno na conservação da qualidade de pães de queijo congelados");
		lProjeto16.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto16.setCategoria("Pesquisa aplicada");
		lProjeto16.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto16.setArea(
				"OORDENADORIA DO CURSO SUPERIOR DE TECNOLOGIA EM PROCESSOS QUÍMICOS (CAMPUS LAGES) (11.01.21.02.16)");
		lProjeto16.setEmailCoordenador("joao.provesi@ifsc.edu.br | provesijg@yahoo.com.br");
		lProjeto16.setCoordenador("JOAO GUSTAVO PROVESI");
		lProjeto16.setDataCadastro(DateUtil.criarData(11, 3, 2019));
		listProjetos.add(lProjeto16);

		Projeto lProjeto17 = new Projeto();
		lProjeto17.setCodigo("PILGS1029-2019");
		lProjeto17.setTitulo("Desenvolvimento de sorvete probiótico utilizando a microencapsulação e hidrolisados do colágeno como crioprotetores microbianos");
		lProjeto17.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto17.setCategoria("Pesquisa aplicada");
		lProjeto17.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto17.setArea("COORDENADORIA DO CURSO SUPERIOR DE TECNOLOGIA EM PROCESSOS QUÍMICOS (CAMPUS LAGES) (11.01.21.02.16)");
		lProjeto17.setEmailCoordenador("joao.provesi@ifsc.edu.br | provesijg@yahoo.com.br");
		lProjeto17.setCoordenador("JOAO GUSTAVO PROVESI");
		lProjeto17.setDataCadastro(DateUtil.criarData(29, 3, 2019));
		listProjetos.add(lProjeto17);

		Projeto lProjeto18 = new Projeto();
		lProjeto18.setCodigo("PILGS1312-2019");
		lProjeto18.setTitulo("Tabela Periódica 3D – Aprendizagem baseada em projetos no ensino de química para alunos da primeira fase do curso técnico em Análises Químicas do IFSC Campus Lages");
		lProjeto18.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto18.setCategoria("Pesquisa aplicada");
		lProjeto18.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto18.setArea("COORDENADORIA DO CURSO SUPERIOR DE TECNOLOGIA EM PROCESSOS QUÍMICOS (CAMPUS LAGES) (11.01.21.02.16)");
		lProjeto18.setEmailCoordenador("joao.provesi@ifsc.edu.br | provesijg@yahoo.com.br");
		lProjeto18.setCoordenador("JOAO GUSTAVO PROVESI");
		lProjeto18.setDataCadastro(DateUtil.criarData(24, 10, 2019));
		listProjetos.add(lProjeto18);

		Projeto lProjeto19 = new Projeto();
		lProjeto19.setCodigo("PILGS1338-2019");
		lProjeto19.setTitulo("Valorizando o agroecológico: composição e bioativos em alimentos de origem animal e vegetal produzidos por sistemas agroecológicos e comercializados na serra catarinense");
		lProjeto19.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto19.setCategoria("Pesquisa aplicada");
		lProjeto19.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto19.setArea("COORDENADORIA DO CURSO SUPERIOR DE TECNOLOGIA EM PROCESSOS QUÍMICOS (CAMPUS LAGES) (11.01.21.02.16)");
		lProjeto19.setEmailCoordenador("joao.provesi@ifsc.edu.br | provesijg@yahoo.com.br");
		lProjeto19.setCoordenador("JOAO GUSTAVO PROVESI");
		lProjeto19.setDataCadastro(DateUtil.criarData(31, 10, 2019));
		listProjetos.add(lProjeto19);

		Projeto lProjeto20 = new Projeto();
		lProjeto20.setCodigo("PILGS1126-2019");
		lProjeto20.setTitulo("Aplicação de biopolímeros antioxidantes a base de amido de pinhão e pectina cítrica na conservação pós-colheita de uvas.");
		lProjeto20.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto20.setCategoria("Pesquisa aplicada");
		lProjeto20.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto20.setArea("COORDENADORIA CURSOS TECNICO EM AGROECOLOGIA (CAMPUS LAGES) (11.01.21.02.10)");
		lProjeto20.setEmailCoordenador("jocleita.ferrareze@ifsc.edu.br | joferrareze@yahoo.com.br");
		lProjeto20.setCoordenador("JOCLEITA PERUZZO FERRAREZE");
		lProjeto20.setDataCadastro(DateUtil.criarData(10, 4, 2019));
		listProjetos.add(lProjeto20);

		Projeto lProjeto21 = new Projeto();
		lProjeto21.setCodigo("PILGS1462-2019");
		lProjeto21.setTitulo("Utilização de água da chuva para irrigação de hortaliças em sistema Agroecológico");
		lProjeto21.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto21.setCategoria("Pesquisa aplicada");
		lProjeto21.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto21.setArea("COORDENADORIA CURSOS TECNICO EM AGROECOLOGIA (CAMPUS LAGES) (11.01.21.02.10)");
		lProjeto21.setEmailCoordenador("jocleita.ferrareze@ifsc.edu.br | joferrareze@yahoo.com.br");
		lProjeto21.setCoordenador("JOCLEITA PERUZZO FERRAREZE");
		lProjeto21.setDataCadastro(DateUtil.criarData(10, 4, 2019));
		listProjetos.add(lProjeto21);

		Projeto lProjeto22 = new Projeto();
		lProjeto22.setCodigo("PILGS1076-2019");
		lProjeto22.setTitulo("Avaliação de módulo fotovoltaico para iluminação da área didática-experimental do IFSC/Campus Lages");
		lProjeto22.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto22.setCategoria("Pesquisa aplicada");
		lProjeto22.setSituacao(Situacao.REPROVADO.codigo);
		lProjeto22.setArea("COORDENADORIA CURSOS TECNICO EM AGROECOLOGIA (CAMPUS LAGES) (11.01.21.02.10)");
		lProjeto22.setEmailCoordenador("jose.mecabo@ifsc.edu.br | josemecabo@yahoo.com.br");
		lProjeto22.setCoordenador("JOSE MECABO JUNIOR");
		lProjeto22.setDataCadastro(DateUtil.criarData(9, 4, 2019));
		listProjetos.add(lProjeto22);

		Projeto lProjeto23 = new Projeto();
		lProjeto23.setCodigo("PILGS1008-2019");
		lProjeto23.setTitulo("Desenvolvimento de um sistema web para controle dos atendimentos da psicóloga do campus");
		lProjeto23.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto23.setCategoria("Pesquisa aplicada");
		lProjeto23.setSituacao(Situacao.REPROVADO.codigo);
		lProjeto23.setArea("COORDENADORIA DO CURSO TECNICO EM INFORMATICA PARA INTERNET (CAMPUS LAGES) (11.01.21.02.20)");
		lProjeto23.setEmailCoordenador("juliano.goncalves@ifsc.edu.br");
		lProjeto23.setCoordenador("JULIANO LUCAS GONCALVES");
		lProjeto23.setDataCadastro(DateUtil.criarData(23, 5, 2019));
		listProjetos.add(lProjeto23);

		Projeto lProjeto24 = new Projeto();
		lProjeto24.setCodigo("PILGS1089-2019");
		lProjeto24.setTitulo("Sistema web para gerenciamento de mensagens baseado no perfil do usuário");
		lProjeto24.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto24.setCategoria("Pesquisa aplicada");
		lProjeto24.setSituacao(Situacao.REPROVADO.codigo);
		lProjeto24.setArea("COORDENADORIA DO CURSO TECNICO EM INFORMATICA PARA INTERNET (CAMPUS LAGES) (11.01.21.02.20)");
		lProjeto24.setEmailCoordenador("juliano.goncalves@ifsc.edu.br | julianolg@gmail.com");
		lProjeto24.setCoordenador("JULIANO LUCAS GONCALVES");
		lProjeto24.setDataCadastro(DateUtil.criarData(10, 4, 2019));
		listProjetos.add(lProjeto24);

		Projeto lProjeto25 = new Projeto();
		lProjeto25.setCodigo("PILGS1451-2019");
		lProjeto25.setTitulo("AVALIAÇÃO DA QUALIDADE QUÍMICA E FÍSICA DE COMPOSTAGEM E VERMICOMPOSTAGEM DOS RESÍDUOS ORGÂNICOS GERADOS PELO CÂMPUS LAGES");
		lProjeto25.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto25.setCategoria("Pesquisa aplicada");
		lProjeto25.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto25.setArea("COORDENADORIA DO CURSO SUPERIOR DE TECNOLOGIA EM GESTAO DO AGRONEGOCIO (CAMPUS LAGES) (11.01.21.02.14.02)");
		lProjeto25.setEmailCoordenador("luciane.costa@ifsc.edu.br | lucianecosta.ifsc@gmail.com");
		lProjeto25.setCoordenador("LUCIANE COSTA DE OLIVEIRA");
		lProjeto25.setDataCadastro(DateUtil.criarData(12, 10, 2019));
		listProjetos.add(lProjeto25);

		Projeto lProjeto26 = new Projeto();
		lProjeto26.setCodigo("PILGS1457-2019");
		lProjeto26.setTitulo("AVALIAÇÃO DA QUALIDADE QUÍMICA E FÍSICA DE COMPOSTAGEM E VERMICOMPOSTAGEM DOS RESÍDUOS ORGÂNICOS GERADOS PELO CÂMPUS LAGES");
		lProjeto26.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto26.setCategoria("Pesquisa aplicada");
		lProjeto26.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto26.setArea("COORDENADORIA DO CURSO TECNICO EM ADMINISTRAÇÃO (CAMPUS LAGES) (11.01.21.02.19)");
		lProjeto26.setEmailCoordenador("marisa.sanson@ifsc.edu.br | sanson.marisa@gmail.com");
		lProjeto26.setCoordenador("MARISA SANTOS SANSON");
		lProjeto26.setDataCadastro(DateUtil.criarData(13, 11, 2019));
		listProjetos.add(lProjeto26);

		Projeto lProjeto27 = new Projeto();
		lProjeto27.setCodigo("PILGS1400-2019");
		lProjeto27.setTitulo("Gerador Humanomotriz");
		lProjeto27.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto27.setCategoria("Pesquisa aplicada");
		lProjeto27.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto27.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto27.setEmailCoordenador("matheus.fontanelle@ifsc.edu.br | matheus.ifsc@gmail.com");
		lProjeto27.setCoordenador("MATHEUS FONTANELLE PEREIRA");
		lProjeto27.setDataCadastro(DateUtil.criarData(04, 11, 2019));
		listProjetos.add(lProjeto27);

		Projeto lProjeto28 = new Projeto();
		lProjeto28.setCodigo("PILGS986-2019");
		lProjeto28.setTitulo("Desenvolvimento de filmes contendo compostos bioativos para embalagens de alimentos");
		lProjeto28.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto28.setCategoria("Pesquisa aplicada");
		lProjeto28.setSituacao(Situacao.DESATIVADO.codigo);
		lProjeto28.setArea("DEPARTAMENTO DE ENSINO, PESQUISA E EXTENSÃO (CAMPUS LAGES) (11.01.21.02)");
		lProjeto28.setEmailCoordenador("michael.nunes@ifsc.edu.br");
		lProjeto28.setCoordenador("MICHAEL RAMOS NUNES");
		lProjeto28.setDataCadastro(DateUtil.criarData(21, 3, 2019));
		listProjetos.add(lProjeto28);

		Projeto lProjeto29 = new Projeto();
		lProjeto29.setCodigo("PILGS1121-2019");
		lProjeto29.setTitulo("Desenvolvimento de nanopartículas de prata para aplicação em enxertos ósseos de uso odontológico");
		lProjeto29.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto29.setCategoria("Pesquisa aplicada");
		lProjeto29.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto29.setArea("DEPARTAMENTO DE ENSINO, PESQUISA E EXTENSÃO (CAMPUS LAGES) (11.01.21.02)");
		lProjeto29.setEmailCoordenador("michael.nunes@ifsc.edu.br");
		lProjeto29.setCoordenador("MICHAEL RAMOS NUNES");
		lProjeto29.setDataCadastro(DateUtil.criarData(10, 4, 2019));
		listProjetos.add(lProjeto29);

		Projeto lProjeto30 = new Projeto();
		lProjeto30.setCodigo("PILGS1255-2019");
		lProjeto30.setTitulo("10 anos de IFSC em Lages: impacto da interiorização da educação profissional em SC");
		lProjeto30.setTipo("Projeto Interno de Fluxo Contínuo (Projeto Novo)");
		lProjeto30.setCategoria("Desenvolvimento de Projetos de Pesquisa de Fluxo Contínuo");
		lProjeto30.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto30.setArea("COORDENADORIA DO CURSO TECNICO EM INFORMATICA PARA INTERNET (CAMPUS LAGES) (11.01.21.02.20)");
		lProjeto30.setEmailCoordenador("paula.jesus@ifsc.edu.br");
		lProjeto30.setCoordenador("PAULA CLARICE SANTOS GRAZZIOTIN DE JESUS");
		lProjeto30.setDataCadastro(DateUtil.criarData(29, 8, 2019));
		listProjetos.add(lProjeto30);

		Projeto lProjeto31 = new Projeto();
		lProjeto31.setCodigo("PILGS1275-2019");
		lProjeto31.setTitulo("10 anos de IFSC em Lages: a história do câmpus");
		lProjeto31.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto31.setCategoria("Pesquisa aplicada");
		lProjeto31.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto31.setArea("COORDENADORIA DO CURSO TECNICO EM INFORMATICA PARA INTERNET (CAMPUS LAGES) (11.01.21.02.20)");
		lProjeto31.setEmailCoordenador("paula.jesus@ifsc.edu.br");
		lProjeto31.setCoordenador("PAULA CLARICE SANTOS GRAZZIOTIN DE JESUS");
		lProjeto31.setDataCadastro(DateUtil.criarData(24, 9, 2019));
		listProjetos.add(lProjeto31);

		Projeto lProjeto32 = new Projeto();
		lProjeto32.setCodigo("PILGS1084-2019");
		lProjeto32.setTitulo("Biomassa e composição química do óleo essencial de Lavanda (Lavandula angustifolia Mill.) sob diferentes fontes de adubação");
		lProjeto32.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto32.setCategoria("Pesquisa aplicada");
		lProjeto32.setSituacao(Situacao.EM_EXECUCAO.codigo);
		lProjeto32.setArea("COORDENADORIA CURSOS TECNICO EM AGROECOLOGIA (CAMPUS LAGES) (11.01.21.02.10)");
		lProjeto32.setEmailCoordenador("paula.iaschitzki@ifsc.edu.br");
		lProjeto32.setCoordenador("PAULA IASCHITZKI FERREIRA CIPRIANI");
		lProjeto32.setDataCadastro(DateUtil.criarData(10, 4, 2019));
		listProjetos.add(lProjeto32);

		Projeto lProjeto33 = new Projeto();
		lProjeto33.setCodigo("PILGS1335-2019");
		lProjeto33.setTitulo("​ Identificação molecular de coliformes termotolerantes em carne moída comercializada na municipalidade de Lages.");
		lProjeto33.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto33.setCategoria("Desenvolvimento tecnológico e inovação");
		lProjeto33.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto33.setArea("COORDENADORIA DE CURSOS TÉCNICOS DE BIOTECNOLOGIA (CAMPUS LAGES) (11.01.21.02.01)");
		lProjeto33.setEmailCoordenador("paulo.henrique@ifsc.edu.br");
		lProjeto33.setCoordenador("PAULO HENRIQUE MATAYOSHI CALIXTO	");
		lProjeto33.setDataCadastro(DateUtil.criarData(28, 10, 2019));
		listProjetos.add(lProjeto33);

		Projeto lProjeto34 = new Projeto();
		lProjeto34.setCodigo("PILGS1382-2019");
		lProjeto34.setTitulo("Identificação molecular de Salmonella spp. em ovos comercializados em supermercados de Lages, SC.");
		lProjeto34.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto34.setCategoria("Pesquisa aplicada");
		lProjeto34.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto34.setArea("COORDENADORIA DE CURSOS TÉCNICOS DE BIOTECNOLOGIA (CAMPUS LAGES) (11.01.21.02.01)");
		lProjeto34.setEmailCoordenador("paulo.henrique@ifsc.edu.br");
		lProjeto34.setCoordenador("PAULO HENRIQUE MATAYOSHI CALIXTO");
		lProjeto34.setDataCadastro(DateUtil.criarData(4, 11, 2019));
		listProjetos.add(lProjeto34);

		Projeto lProjeto35 = new Projeto();
		lProjeto35.setCodigo("PILGS1464-2019");
		lProjeto35.setTitulo("Construção de set para manipulação de DNA para o ensino de Biologia Molecular.");
		lProjeto35.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto35.setCategoria("Pesquisa aplicada");
		lProjeto35.setSituacao(Situacao.SUBMETIDO.codigo);
		lProjeto35.setArea("COORDENADORIA CURSOS TECNICO DE BIOTECNOLOGIA (CAMPUS LAGES) (11.01.21.02.01)");
		lProjeto35.setEmailCoordenador("paulo.henrique@ifsc.edu.br");
		lProjeto35.setCoordenador("PAULO HENRIQUE MATAYOSHI CALIXTO");
		lProjeto35.setDataCadastro(DateUtil.criarData(13, 11, 2019));
		listProjetos.add(lProjeto35);
		
		Projeto lProjeto36 = new Projeto();
		lProjeto36.setCodigo("PILGS354-2018");
		lProjeto36.setTitulo("Sistema de Monitoramento Remoto de Microclima em Vinhedos");
		lProjeto36.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto36.setCategoria("Desenvolvimento tecnológico e inovação");
		lProjeto36.setSituacao(Situacao.FINALIZADO.codigo);
		lProjeto36.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto36.setEmailCoordenador("robson.costa@ifsc.edu.br");
		lProjeto36.setCoordenador("ROBSON COSTA");
		lProjeto36.setDataCadastro(DateUtil.criarData(12, 4, 2018));
		listProjetos.add(lProjeto36);
		
		Projeto lProjeto37 = new Projeto();
		lProjeto37.setCodigo("PVLGS116-2017");
		lProjeto37.setTitulo("Identificação dos fatores que levam a reprovação em disciplinas introdutórias de programação nos cursos técnico e superior do câmpus.");
		lProjeto37.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto37.setCategoria("Pesquisa básica");
		lProjeto37.setSituacao(Situacao.FINALIZADO.codigo);
		lProjeto37.setArea("COORDENADORIA DE CURSOS TÉCNICOS DE INFORMÁTICA (CAMPUS LAGES) (11.01.21.02.02)");
		lProjeto37.setEmailCoordenador("juliano.goncalves@ifsc.edu.br");
		lProjeto37.setCoordenador("JULIANO LUCAS GONCALVES");
		lProjeto37.setDataCadastro(DateUtil.criarData(6, 11, 2017));
		listProjetos.add(lProjeto37);

		return listProjetos;
	}

	public static List<Projeto> filtrar(RequestSituacao aSituacao) {
		List<Projeto> lProjetos = ProjetosUtil.criarProjetos();
		List<Projeto> listProjetos = new ArrayList<>();
		if (aSituacao.getAno() == null && aSituacao.getSituacao() == null) {
			listProjetos = lProjetos;
		} else {
			if (aSituacao.getAno() != null && aSituacao.getSituacao() != null) {
				listProjetos = ProjetosUtil.filtrar(lProjetos, aSituacao);
			} else if (aSituacao.getAno() != null && aSituacao.getSituacao() == null) {
				listProjetos = ProjetosUtil.filtrarAno(lProjetos, aSituacao.getAno());
			} else {
				listProjetos = ProjetosUtil.filtrarSituacao(lProjetos, aSituacao.getSituacao());
			}
		}
		return listProjetos;
	}

	public static List<Projeto> filtrar(List<Projeto> aProjetos, RequestSituacao aRequestSituacao) {
		List<Projeto> lProjetos = aProjetos;
		List<Projeto> lProjetosFiltrados = new ArrayList<>();
		for (Projeto lProjeto : lProjetos) {
			Calendar lCalendar = Calendar.getInstance();
			lCalendar.setTime(lProjeto.getDataCadastro());
			if (lCalendar.get(Calendar.YEAR) == aRequestSituacao.getAno()
					&& lProjeto.getSituacao() == aRequestSituacao.getSituacao()) {
				lProjetosFiltrados.add(lProjeto);
			}
		}
		return lProjetosFiltrados;
	}

	public static List<Projeto> filtrarAno(List<Projeto> aProjetos, int aAno) {
		List<Projeto> lProjetos = aProjetos;
		List<Projeto> lProjetosFiltrados = new ArrayList<>();
		for (Projeto lProjeto : lProjetos) {
			Calendar lCalendar = Calendar.getInstance();
			lCalendar.setTime(lProjeto.getDataCadastro());
			if (lCalendar.get(Calendar.YEAR) == aAno) {
				lProjetosFiltrados.add(lProjeto);
			}
		}
		return lProjetosFiltrados;
	}

	public static List<Projeto> filtrarSituacao(List<Projeto> aProjetos, int aSituacao) {
		List<Projeto> listProjetos = aProjetos;
		List<Projeto> listProjetosPorSituacao = new ArrayList<>();
		for (Projeto lProjeto : listProjetos) {
			if (lProjeto.getSituacao() == aSituacao) {
				listProjetosPorSituacao.add(lProjeto);
			}
		}
		return listProjetosPorSituacao;
	}

	public static DashboardInfos montarDashBoard() {
		DashboardInfos lDashboardInfos = new DashboardInfos();
		List<ProjetosPorSituacao> list = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			list.add(new ProjetosPorSituacao(i));
		}
		List<Projeto> listProjetos = ProjetosUtil.criarProjetos();
		lDashboardInfos.setTotalProjetos(listProjetos.size());
		for (Projeto lProjeto : listProjetos) {
			switch (lProjeto.getSituacao()) {
			case 0:
				list.get(0).addQtd();
				break;
			case 1:
				list.get(1).addQtd();
				break;
			case 2:
				list.get(2).addQtd();
				break;
			case 3:
				list.get(3).addQtd();
				break;
			case 4:
				list.get(4).addQtd();
				break;
			case 5:
				list.get(5).addQtd();
				break;
			case 6:
				list.get(6).addQtd();
				break;
			case 7:
				list.get(7).addQtd();
				break;
			case 8:
				list.get(8).addQtd();
				break;
			case 9:
				list.get(9).addQtd();
				break;
			case 10:
				list.get(10).addQtd();
				break;
			case 11:
				list.get(11).addQtd();
				break;
			case 12:
				list.get(12).addQtd();
				break;
			case 13:
				list.get(13).addQtd();
				break;
			}
		}
		lDashboardInfos.setProjetosPorSituacaos(list);
		return lDashboardInfos;
	}*/
}
