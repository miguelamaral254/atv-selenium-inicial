# Testando Selenium com Java e Springboot

## Como testar?


#### 1- Execute o arquivo main AtvSeleniumApplication 
#### 2- Acesse em seu navegador o seguinte link: http://localhost:8080/noticias
 
### Atenção!
 Se atente ao sistema operacional que está ultilizando. Caso seja Diferente de MacOS, troque o driver para o de Windows(já se encontra no diretório raiz)
 Basta trocar em NoticiaService, localizado em br.com.atvselenium, a linha  System.setProperty("webdriver.chrome.driver", "chromedriver-mac-arm64/chromedriver"); para   "chromedriver/chromedriver.exe".
 Repita o processo para G1Noticia.
