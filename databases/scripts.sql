CREATE TABLE public.t_chamado
(
  codigo serial NOT NULL,
  data date,
  codigo_funcionario integer,
  status integer,
  titulo_problema character varying(100),
  descricao_problema text,
  codigo_chave integer,
  exclusao integer,
  CONSTRAINT t_chamado_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_chamado
  OWNER TO jeferson;
  
  
CREATE TABLE public.t_chamado_final
(
  codigo serial NOT NULL,
  codigo_chamado integer,
  datafinal date,
  solucao text,
  exclusao integer,
  CONSTRAINT t_chamado_final_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_chamado_final
  OWNER TO jeferson;

  
CREATE TABLE public.t_chamado_item
(
  codigo serial NOT NULL,
  codigo_chamado integer,
  data date,
  titulo character varying(50),
  andamento text,
  exclusao integer,
  CONSTRAINT t_chamado_item_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_chamado_item
  OWNER TO jeferson;
  

CREATE TABLE public.t_chamado_status
(
  codigo serial NOT NULL,
  nome character varying(20),
  exclusao integer,
  CONSTRAINT t_chamado_status_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_chamado_status
  OWNER TO jeferson;
  

CREATE TABLE public.t_chave
(
  codigo serial NOT NULL,
  nome character varying(50),
  exclusao integer,
  CONSTRAINT t_chave_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_chave
  OWNER TO jeferson;
  

CREATE TABLE public.t_cidade
(
  codigo integer NOT NULL,
  nome character varying(50),
  estado_cod integer,
  exclusao integer,
  CONSTRAINT t_cidade_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_cidade
  OWNER TO jeferson;
  

CREATE TABLE public.t_contagem
(
  codigo serial NOT NULL,
  data date,
  produto_cod integer,
  qtde integer,
  pessoa_cod integer,
  exclusao integer,
  CONSTRAINT t_contagem_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_contagem
  OWNER TO jeferson;
  

CREATE TABLE public.t_entrada
(
  codigo serial NOT NULL,
  danfe character varying(8),
  data_danfe date,
  data_sistema date,
  fornecedor_cod integer,
  obs text,
  senha character varying(8),
  exclusao integer,
  CONSTRAINT t_entrada_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_entrada
  OWNER TO jeferson;
  

CREATE TABLE public.t_entrada_item
(
  codigo serial NOT NULL,
  entrada_cod integer,
  produto_cod integer,
  qtde integer,
  valor numeric(12,2),
  exclusao integer,
  CONSTRAINT t_entrada_item_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_entrada_item
  OWNER TO jeferson;
  

CREATE TABLE public.t_estado
(
  codigo integer NOT NULL,
  nome character varying(50),
  sigla character varying(2),
  pais_cod integer,
  exclusao integer,
  CONSTRAINT t_estado_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_estado
  OWNER TO jeferson;
  

CREATE TABLE public.t_pais
(
  codigo integer NOT NULL,
  nome character varying(50),
  exclusao integer,
  CONSTRAINT t_pais_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_pais
  OWNER TO jeferson;
  

CREATE TABLE public.t_pessoa
(
  codigo serial NOT NULL,
  tipo_pessoa integer,
  nome character varying(50),
  apelidofantasia character varying(50),
  cpfcnpj character varying(20),
  rgie character varying(20),
  endereco character varying(50),
  numero character varying(5),
  bairro character varying(30),
  cep character varying(10),
  cidade_cod integer,
  dtnasc date,
  fone1 character varying(20),
  fone2 character varying(20),
  cel1 character varying(20),
  cel2 character varying(20),
  email character varying(50),
  obs text,
  chkcliente integer,
  chkfornecedor integer,
  chkfuncionario integer,
  bloqueio integer,
  exclusao integer,
  CONSTRAINT t_pessoa_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_pessoa
  OWNER TO jeferson;
  

CREATE TABLE public.t_pessoa_tipo
(
  codigo serial NOT NULL,
  nome character varying(20),
  exclusao integer,
  CONSTRAINT t_pessoa_tipo_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_pessoa_tipo
  OWNER TO jeferson;
  

CREATE TABLE public.t_produto
(
  codigo serial NOT NULL,
  codigo_fornecedor character varying(30),
  nome character varying(100),
  ncm character varying(8),
  codigomedida integer,
  codigo_cad_fornecedor integer,
  qtde_min integer,
  qtde_max integer,
  qtde integer,
  codigo_ativo integer,
  descricao text,
  exclusao integer,
  CONSTRAINT t_produto_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_produto
  OWNER TO jeferson;
  

CREATE TABLE public.t_saida
(
  codigo serial NOT NULL,
  pedido character varying(15),
  danfe character varying(8),
  data_danfe date,
  data_sistema date,
  fornecedor_cod integer,
  obs text,
  senha character varying(8),
  exclusao integer,
  CONSTRAINT t_saida_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_saida
  OWNER TO jeferson;
  

CREATE TABLE public.t_saida_item
(
  codigo serial NOT NULL,
  saida_cod integer,
  produto_cod integer,
  qtde integer,
  valor numeric(12,2),
  exclusao integer,
  CONSTRAINT t_saida_item_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_saida_item
  OWNER TO jeferson;
  

CREATE TABLE public.t_serie
(
  codigo serial NOT NULL,
  produto_cod integer,
  fabricante_cod integer,
  serie character varying(20),
  danfe character varying(10),
  data_danfe date,
  baixa integer,
  exclusao integer,
  CONSTRAINT t_serie_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_serie
  OWNER TO jeferson;
  

CREATE TABLE public.t_status
(
  codigo serial NOT NULL,
  nome character varying(15),
  exclusao integer,
  CONSTRAINT t_status_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_status
  OWNER TO jeferson;
  

CREATE TABLE public.t_tipo_pessoa
(
  codigo serial NOT NULL,
  nome character varying(50),
  exclusao integer,
  CONSTRAINT t_tipo_pessoa_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_tipo_pessoa
  OWNER TO jeferson;


CREATE TABLE public.t_unidade
(
  codigo integer NOT NULL,
  unidade character varying(30),
  abreviacao character varying(2),
  exclusao integer,
  CONSTRAINT t_unidade_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_unidade
  OWNER TO jeferson;
  

CREATE TABLE public.t_viagem
(
  codigo serial NOT NULL,
  data_abrir date,
  data_finalizar date,
  destino character varying(100),
  tecnico_cod integer,
  senha character varying(8),
  exclusao integer,
  CONSTRAINT t_viagem_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_viagem
  OWNER TO jeferson;
  

CREATE TABLE public.t_viagem_item
(
  codigo serial NOT NULL,
  codigo_viagem integer,
  produto_cod integer,
  qtde_liberada integer,
  qtde_devolvida integer,
  exclusao integer,
  CONSTRAINT t_viagem_item_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.t_viagem_item
  OWNER TO jeferson;