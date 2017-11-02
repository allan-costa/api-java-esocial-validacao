# api-java-esocial-validacao
Está api tem a finalidade de validar dados de um trabalhador e salvar no banco de dados da empresa.
O JSON possui o seguinte formato:

{
	"id": 1, 
	"nmTrab": "NOME",
	"sexo": "M/F",
	"racaCor": 5,
	"estCiv": 1..6,
	"grauInstr": "10",
	"nmSoc": "ALLAN COSTA",
	"dtNascto": "1988-11-17",
	"codMunicNascto": "0001",
	"ufNascto": "GO",
	"paisNascto": "BRA",
	"paisNac": "BRA",
	"nmPai": "EURIPEDES",
	"nmMae": "MARIA",
	"trabAposent": "N"
}

Campos: 
Id Long: Obrigatório,
nmTrab String[70]: Nome do trabalhador,
sexo String[1]: 
("M" / "F"),
racaCor Long: 
(INDIGINA = 1, BRANCO = 2, NEGRA = 3, AMARELA = 4, PARDA = 5, NAOINFORMADO = 6),
estCiv Long: Estado civil
(SOLTEIRO = 1, CASADO = 2, DIVORCIADO = 3, VIUVO = 4, UNIAOESTAVEL = 5, OUTROS = 6),
nmSoc String[70]: Nome social,
dtNascto Date: Data de nascimento,
codMunicNascto String: Código do município de nascimento,
ufNascto: String[2]: Unidade da federação de nascimento,
paisNascto String[3]: País de nascimento,
paisNac String[3]: Nacionalidade,
nmPai String[70]: Nome do pai,
nmMae String[70]: Nome da mãe,
trabAposent String: Trabalhador aposentado
("S" / "N"),
grauInstr String: 
01 – Analfabeto
02 – Até a 4º série incompleta do ensino fundamental (antigo 1º grau ou primário), ou que tenha se alfabetizado sem ter freqüentado escola regular
03 – 4º série completa do ensino fundamental (antigo 1º grau ou ginásio)
04 – Da 5º a 8º série do ensino fundamental (antigo 1º grau ou ginásio)
05 – Ensino fundamental completo (antigo 1º grau, primário ou ginásio)
06 – Ensino médio incompleto (antigo 2º grau, secundário ou colegial)
07 – Ensino médico completo (antigo 2º grau, secundário ou colegial)
08 – Educação Superior incompleta
09 – Educação Superior completa
10 – Pós Graduação
11 – Mestrado
12 - Doutorado.

Orientações:
1: É necessário que haja pelo menos uma pessoa no banco de dados com o ID a ser inserido pois é um pré requisito da funcionalidade de validação.

Esse projeto faz uso das ferramentas SpringSTS e do banco de dados H2. http://www.h2database.com/html/main.html
É recomendavel o uso do aplicativo POTSMAN para usar a API.
Configurações H2 database:
JDBC URL: jdbc:h2:mem:testdb.
Interface: http://localhost:8080/h2-console/


