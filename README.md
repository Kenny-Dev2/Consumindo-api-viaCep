# 🧾 Buscador de Endereços (ViaCEP CLI)

Aplicativo de linha de comando (CLI) desenvolvido em Java que consome a API do ViaCEP para buscar endereços a partir de um CEP. O sistema oferece interação via menu no terminal, com exibição organizada dos dados e tratamento de erros.

---

## 🚀 Funcionalidades

* 🔎 Busca de endereço por CEP
* 📡 Consumo de API REST com `HttpClient`
* 🔄 Conversão de JSON para objeto Java com Gson
* 🧭 Menu interativo no terminal
* 🧹 Limpeza de tela para melhor experiência do usuário
* ⚠️ Tratamento de erros (CEP inválido, entrada incorreta)

---

## 🛠️ Tecnologias utilizadas

* Java 17+
* Gson (Google JSON)
* API pública ViaCEP
* Programação orientada a objetos (POO)

---

## 📁 Estrutura do projeto

```
src/
├── Main.java
├── menu/
├── model/
├── principal/
├── service/
└── utils/
```

* **menu** → interface do usuário (CLI)
* **model** → representação dos dados (DTO e domínio)
* **principal** → lógica principal da aplicação
* **service** → consumo de API
* **utils** → utilitários (ex: limpar tela)

---

## ▶️ Como executar

### 🔧 Pré-requisitos

* Java instalado (JDK 17+)
* Biblioteca Gson adicionada ao classpath

### 💻 Compilar e executar via terminal

```bash
javac -cp ".;lib/gson-2.10.1.jar" -d . src/**/*.java
java -cp ".;lib/gson-2.10.1.jar" Main
```

> No Linux/macOS, substitua `;` por `:`

---

## 💡 Exemplo de uso

```
===============================
    BUSCADOR DE ENDEREÇOS
===============================

1 - Buscar por CEP
2 - Buscar por rua
3 - Sair

Digite o CEP: 01001000

Resultado:
CEP: 01001-000
Rua: Praça da Sé
Cidade: São Paulo
Estado: SP
```

---

## 📌 Melhorias futuras

* [ ] Buscar endereço por nome da rua
* [ ] Validação avançada de CEP
* [ ] Adição de cores no terminal
* [ ] Histórico de buscas
* [ ] Transformar em aplicação com interface gráfica ou API REST

---

## 📄 Licença

Este projeto é de uso educacional e livre para estudos.

---

## 👨‍💻 Autor

Desenvolvido por Kennedy Francisco
