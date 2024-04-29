## Principais Componentes

### Câmeras
---

- *Sensor de Imagem*
	- Converte luz em sinal elétrico
	- Principal elemento da qualidade de imagem
	- Cada pixel acumula uma carga dependendo da luminosidade
	- Possui diferentes tamanhos, variando entre 1/4 a 2/3
- *Padrão de Imagem*
	- *NTSC*
		Uso em sistema de TV broadcast, 60Hz, 525 linhas e 30 quadros por segundo
	- *PAL*
		Mais utilizado na europa, 50Hz, 625 linhas e 25 quadros por segundo
	- *D1*
		Desenvolvido para gravação de fitas magnéticas
	- *CIF*
		Desenvolvido inicialmente para videoconferência
	- *VGA*
		Foi o padrão na indústria da informática
	- *HD*
		Padrão de alta definição com resoluções maiores
- *Modos de Varredura*
	- *Entrelaçado*
		A imagem é captada em linhas pares e ímpares do sensor. Pode dobrar a quantidade de quadros captados por um sensor
	- *Progressivo*
		A imagem é captada utilizando todas as linhas do sensor, gerando uma melhor qualidade de imagem
- *Sensibilidade*
	Avalia a qualidade da imagem em iluminações diferentes de uma forma aceitável ou utilizável. Algumas variáveis influenciam na medição
- *Lentes*
	- *Fixas*
		Possuem um único foco com lentes não ajustáveis
	- *Variáveis*
		Possuem capacidade de foco manual ou motorizado
- *Linhas de Câmeras*
	- *Bullet*
		Fácil instalação, mais precisão e mais utilizada em ambientes externos
	- *Dome*
		Discretas, ideais para teto, alguns modelos com proteção externa IP 66 e 67, mais difíceis de ser retiradas acidentalmente ou propositalmente
	- *Speed Dome*
		Possui direcionamento vertical e horizontal e zoom, rica em detalhes e são mais utilizadas em grandes perímetros
	- *Varifocais*
		Atende diversos cenários e possui ajuste preciso de ângulo de abertura e aproximação (foco e zoom)
	- *Fisheye*
		Sem pontos cegos, possuindo vários ângulos de visão da mesma imagem
	- *Especiais*
		Possuem alta performance, inteligência artificial e são projetadas para fins especiais
- *Tipos*
	- *Analógicas Convencionais* 
		Captação de sinal luminoso, transformação em sinal elétrico, não faz armazenamento sem o gravador e são pouco utilizadas
	- *Analógicas de Alta Definição*
		Melhor qualidade de imagem, necessitam do DVR para gravação de imagem e operam os protocolos HDCVI, HDTVI e AHD
	- *IP*
		Transmite sinal via rede, realiza compressão e processamento da imagem, acesso remoto e necessita ser alimentada via PoE
- *Recursos*
	- *BLC (Back Light Compensation)*
		Aumenta o brilho total da imagem
	- *WDR (Wide Dynamic Range)*
		Imagens nítidas em ambientes de alto contraste e ajusta tanto em áreas claras quanto escuras. DWDR é a compensasão digital
	- *HLC (High Light Compensation)*
		Utilizada para reduzir altos níveis de incidência de luz
	- *Infravermelho*
		Visualização de imagens em ambientes escuros
	- *IK10*
		Nível de proteção anti vandalismo, resistindo impactos de 5Kg a uma altura de 40cm
	- *Zoom Motorizado*
		Ajuste preciso de ângulo de abertura de forma remota com pouca perda de qualidade
	- *Starlight*
		Permite visão colorida mesmo em locais de baixa luminosidade
	- *Full Color*
		Alta performance e visibilidade de cores em ambientes sem luz
	- *Menu OSD*
		Software que permite alterações precisas na imagem para melhor qualidade
- *Codificação e Protocolos*
	- *Codecs*
		Codificação e Decodificação. Servem para comprimir elementos e deixam o arquivo mais leve
	- *Protocolos*
		- *AHD*
			Analógica de alta definição, resolução e qualidade menor comparada aos outros e não possui compatibilidade com outros protocolos
		- *HDCVI*
			Interface de vídeo composto de alta definição, suporta altas definições de imagem e utilizam cabo coaxial
		- *HDTVI*
			Interface de transporte de vídeo em alta definição e transporta apenas sinal de vídeo via cabo coaxial
		- *MultiHD*
			Possui os protocolos analógico, AHD, HDCVI e HDTVI embarcados possibilitando a troca entre protocolos via menu OSD
		- *Intelbras-1*
			Protocolo próprio da intelbras para câmeras IP, proporciona funcionalidades extras
		- *ONVIF*
			Implementação de câmeras IP, NVRs, DVRs e softwares e padroniza a comunicação entre eles
		
### Gravadores
---

- *DVR (Digital Video Recorder)*
	Armazena imagens em HD's e gerencia as câmeras, alguns possuem compatibilidade com câmeras IP
- *NVR (Network Video Recorder)*
	Esclusivo para câmeras IP, armazenam e reproduzem imagens, gerencia as câmeras e podem possuir portas PoE
- *Gravadores IA*
	Gravadores inteligentes com IA embarcada com tecnologias de reconhecimento facial embarcado
- *Características*
	- *Processamento*
		O DVR comumente diminui a quantidade de FPS conforme aumenta a resolução de uma câmera, nos NVR's isso não acontece
		Maior qualidade de imagem e quantidade de FPS aumentam consideravelmente a quantidade de armazenamento exigida
	- *Protocolos*
		Nos DVR's MultiHD, são suportadas câmeras Analógicas, AHD, HDTVI, HDCVI e IP
		Nos NVR's, se utiliza o protocolo Intelbras-1, permitindo a comunicação entre os dispositivos
		O protocolo ONVIF é de código aberto e é a comunicação universal entre várias fabricantes (Intelbras usa ONVIF-S)
	- *Compressão de Vídeo*
		Os gravadores possuem diferentes protocolos de compressão de vídeo sendo:
		
		NVD 1304 (H.264 e H.265)
		MHDX 3104 (H.264B, H.264, H.264H, H.264+, H.265 e H.265+)
		NVDD 5124 (MJPEG, H.264, H.265 e H.265+)
	- *Armazenamento*
		Os gravadores possuem suporte para diferentes tamanhos de HDD
		Clientes normalmente estimam pela quantidade de dias que podem ser gravados
	- *Saídas de Vídeo*
		Os gravadores podem possuir ou não HDMI, VGA, analógica BNC ou HDMI SPOT
		Alguns gravadores podem espelhar o vídeo para duas saídas de vídeo
	- *Acesso Remoto*
		Aluns gravadores possuem compatibilidade para serviços Cloud ou DDNS, gratuítos para clientes Intelbras
	- *Throughput*
		Quantidade de informações trafegadas em uma rede por unidade de tempo
		Gravadores possuem capacidade máxima de entrada e saída de dados
	- *Backup*
		Os HDD's não guardam as imagens infinitamente, mas há a possibilidade de salva-las em outro lugar (por exemplo, usando FTP)
			
### Cabeamentos
---

- *Cabo Coaxial*
	Recomendados para transmissão em CFTV. São RG59, RG6 ou 4mm com 85% mahla de cobre
	Distância em par ordenado em relação a tecnologia (HDCVI,300m), (AHD, 250m), (HDTVI, 250m), (Analógica/SD, 300m)
	Distância em par ordenado em relação a queda de tensão (0,25A, 250m), (0,5A, 120m), (0,7A, 80m), (1,0A, 50m)
	Utilizam conexão BNC, podendo ser de mola ou compressão. Conectores BNC borne não são recomendados para projetos
		
- *Cabo UTP e Balun*
	UTP são cabos parecidos com os de rede. Por possuirem diferentes níveis de impedância, usam o balun para "conversão"
	Para transmissão em CFTV, é recomendado cabos CAT5e 100% cobre
	Distância em par ordenado em relação a tecnologia (HDCVI,200m), (AHD, 250m), (HDTVI, 250m), (Analógica/SD, 350m)
	Pode haver mais de uma câmera trafegando no mesmo cabo UTP e utilizando tecnologia PoE
	- *PoE (Power over Ethernet)*
		Possui dois padrões, IEEE 802.3AF (15.4W recomendadas para bullets e dome) e IEEE 802.3AT (30W para câmeras complexas como speed dome)
		Existe injetores PoE para casos de alimentação de uma única câmera a partir de um ponto de energia qualquer (como a do poste)
		Alguns switchs possuem a tecnologia PoE extender, podendo alcançar 250m via PoE
- *Fibra Ótica*
	Para transmissão a longas distâncias. É necessário um conversor de mídia que dependendo, pode transmitir várias câmeras na mesma fibra
- *Rádio*
	Uma opção alternativa para uma grande cobertura de área, podendo ser de ponto-a-ponto ou ponto-multiponto

### Softwares
---

- *ISIC Lite*
	Gratuito para smartphones android e iOS, visualiza imagens em tempo real e mostra gravações
- *SIM Next*
	Gratuito para Windows, utilizados em cenários até médio porte e possibilita visualização, reprodução, gravação e gerenciamento de eventos
- *Defense IA*
	Cenários de alta complexidade, arquitetura centralizada, suporte à inteligências artificiais, gerenciamento de eventos e relatórios