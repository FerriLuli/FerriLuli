CREATE SCHEMA aula3;

USE aula3;
CREATE TABLE RECEITUARIO (CODIGO VARCHAR(100)
			, NOME_MEDICO       VARCHAR(100) --column1
                        , CRO               INT		 --column2
                        , ESPECIALIDADE     VARCHAR(100) --column3
                        , NOME_PACIENTE     VARCHAR(100) --column4
                        , ENDERECO_PACIENTE VARCHAR(100) --column5
                        , MEDICAMENTO       VARCHAR(100) --column6
                        , DOSE              VARCHAR(100) --column7
                        , FREQUENCIA        VARCHAR(100) --column8
                        , DATA_EMISSAO      DATE	 --column9
			);
                        
INSERT INTO RECEITUARIO (DATA_EMISSAO)
			VALUES(STR_TO_DATE('01/09/2022', "%d/%m/%Y"));
                        
INSERT INTO RECEITUARIO (RECEITUARIO_ID
			, CODIGO
			, NOME_MEDICO
                        , CRO
                        , ESPECIALIDADE
                        , NOME_PACIENTE
                        , ENDERECO_PACIENTE
                        , MEDICAMENTO
                        , DOSE
                        , FREQUENCIA
                        , DATA_EMISSAO
                        )
                        VALUE (NULL
			      ,	'1'
			      , 'PAULO'
                              , '123456789'
                              , 'CARDIOLOGISTA'
                              , 'ANA'
                              , 'RUA 1, 12, MUNICIPIO, ESTADO'
                              , 'LOSARTANA POTÁSSICA'
                              , '1 COMPRIMIDO'
                              , '2 VEZES POR DIA'
                              , STR_TO_DATE('03/09/2022', "%d/%m/%Y")
							  );
                              
ALTER TABLE RECEITUARIO DROP COLUMN CODIGO;

ALTER TABLE RECEITUARIO ADD COLUMN CODIGO VARCHAR(100);

INSERT INTO RECEITUARIO (CODIGO)
						VALUES('1');
                        
ALTER TABLE RECEITUARIO ADD COLUMN RECEITUARIO_ID INT PRIMARY KEY AUTO_INCREMENT;

ALTER TABLE RECEITUARIO ADD CONSTRAINT UNIQUE (CODIGO
					      , NOME_MEDICO
                                              , CRO
                                              );
 
SELECT DATA_EMISSAO 
	FROM RECEITUARIO 
		WHERE DATA_EMISSAO = '2022/09/01';
        
SELECT DATA_EMISSAO 
	FROM RECEITUARIO 
		ORDER BY DATA_EMISSAO;

SELECT ((2+2)/(2));

SELECT *
	FROM RECEITUARIO;

