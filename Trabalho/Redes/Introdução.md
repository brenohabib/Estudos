## TIPOS DE REDE

- *LAN (Local Area Network)*

	Redes LAN são internas, conectando vários dispositivos em uma rede local. São redes em pequena escala, focada em uma pequena área como casas e prédios

- *WAN (Wide Area Network)*

	Redes WAN são externas, sendo providos serviços e internet para redes LAN
	São redes em larga escala, focada em uma grande área como cidades e estados

- *WLAN (Wireless Local Area Network)*

	São redes LAN sem a necessidade de cabeamento seguindo algumas normas IEEE (Institute of Electrical Electronics Engineers)

	- *IEEE*
		
		- *802.11a*
			Frequência de rádio: 5GHz
			Taxa de dados: 54Mbps
			Não compatível com 802.11b e 802.11g
		- *802.11b*
			frequência de rádio: 2.4GHz
			Taxa de dados: 11 Mbps
			Maior distância e penetração
		- *802.11g*
			frequência de rádio: 2.4GHz
			Taxa de dados: 54 Mbps
			Menor largura de banda
		- *802.11n*
			frequência de rádio: 2.4GHz e 5GHz
			Taxa de dados entre 150Mbps a 600Mbps
			Distância entre 70m
			Compatível com dispositivos 802.11a/b/g
			Exigem várias antenas utilizando tecnologia MIMO
		- *802.11ac*
			frequência de rádio: 5GHz
			Taxa de dados: entre 450 Mbps a 1,3 Gbps
			Compatível com dispositivos 802.11a/n
			Exigem várias antenas utilizando tecnologia MIMO
		- *802.11ax*
			frequência de rádio: 2.4GHz e 5GHz
			Padrão mais recente
			Taxas de dados altas
			Eficiência energética
			Capaz de atingir 1,2 Gbps por fluxo
			Wi-fi Geração 6

- *VLAN (Virtual Local Area Network)*
	
	São redes locais virtuais com o objetivo de dividir as redes do ambiente por fins de organização
	Otimizam o tráfego, otimizando os pacotes de dados para determinados dispositivos
	Aumenta a segurança por não permitir relações de dispositivos entre rede virtual x e y
	
- *VPN (Virtual Private Network)*

	Voltada principalmente para segurança entre duas ou mais redes públicas
	Ela criptografa os dados através de um "túnel"
	Pode ser aplicada em sistemas de segurança

## HARDWARE

- *Roteador*
	Conecta a rede local à internet e outras redes
- *Switch*
	Conecta fisicamente os dispositivos na rede. Encaminha pacotes à vários dispositivos
	- *não gerenciáveis*
		Não precisam de configuração
		Menos avançado
		Fácil instalação
	- *gerenciáveis*
		Precisam de configuração
		Mais avançado
		Trabalhosa instalação

### TRANSMISSÃO DE DADOS

- *Meios de transmissão*
	- *Guiado*
		Instalação cabeada
	- *Não Guiado*
		Transmissão via rádio/ar
	
- *Métodos de transmissão*
	- *Unicast*
		Método de transmissão direta entre dois dispositivos (por exemplo, câmera se comunicando com DVR)
	- *Multicast*
		Método de transmissão para múltiplos dispositivos (por exemplo, câmera se comunica com DVR que então se comunica com vários computadores)
	- *Broadcast*
		Usado para enviar pacotes de dados para todos os dispositivos da rede (por exempo, atribuição de IP para dispositivos na rede)

### TOPOLOGIA

- *Física*
	Foca na verdadeira aparência do layout da rede
- *Lógica*
	Foca na lógica de transmissão de dados na rede
- *Principais perspectivas*
	- *Estrela*
		Rede centralizada onde os dispositivos estão conectados em um único gerenciador de rede
	- *Árvore*
		Rede espalhada onde há um gerenciador de rede controlando o tráfego de sub-redes
	- *Anel*
		Rede onde ao menos um gerenciador de rede está conectado a outro, previnindo queda de rede (necessita de redes gerenciáveis com função spanning tree)

## MODELOS

- *Modelo de Referência OSI (Open Sistem Interconnection)* 
	![[OSI.png]]
	- *Camadas*
		- *Aplicação*
			Composto por protocolos e serviços (por exemplo HTTP ou HTTPS)
		- *Apresentação*
			Conversão dos arquivos para caracteres, imagens, etc
		- *Sessão*
			Controla quando começa, termina ou reiniciar aplicações de origem e destino
		- *Transporte*
			Identifica e elimina erros das camadas inferiores. Estabelece uma comunicação direta entre origem e fim
		- *Rede*
			Responsável pelo endereçamento dos dispositivos. Responsável pelas rotas e destinos
		- *Enlace de Dados*
			Corrige erros ocorridos na camada física. Controla o fluxo de dados
		- *Física*
			Comunicação entre dois ou mais dispositivos. Representa a parte física da transmissão de dados

- *Modelo TCP/IP (Transmission Control Protocol/Internet Protocol)*
	![[TCP IP.png]]
	- *Camadas*
		- *Aplicação*
			Representa as camadas 7, 6 e 5 do modelo OSI
		- *Transporte*
			Representa a camada 4 do modelo OSI
		- *Internet*
			Representa a camada 3 do modelo OSI
		- *Interface de Rede*
			Representa as camadas 2 e 1 do modelo OSI
	- *Protocolos*
		- *HTTP (Hypertext Transfer Protocol)*
			Usado para visualizar páginas web na internet. Define como o cliente e servidor interagem
		- *HTTPS (Hypertext Transfer Protocol Secure)*
			Uma evolução do HTTP, feito para proteger os dados enviados entre ciente e servidor. Ela criptografa as informações enviadas
		- *FTP (File Transfer Protocol)*
			Permite a transferência de arquivos pela internet
		- *SFTP (Secure File Transfer Protocol)*
			Atua como o FTP, mas criptografa as informações enviadas
		- *DNS (Domain Name System)*
			Traduz os IP's para endereços de fácil acesso em forma de URL
		- *DDNS (Dynamic Domain Name System)*
			Usado comumente para acessar dispositivos em casa. Podem ser acessados pela internet
		- *SNMP*
			
			