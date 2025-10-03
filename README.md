# Padrão Abstract Factory

O **padrão Abstract Factory** é um padrão de projeto **criacional** que fornece uma **interface para criar famílias de objetos relacionados** sem especificar suas classes concretas.  
Ele é útil quando precisamos garantir que diferentes objetos criados sejam **compatíveis entre si** e possam ser trocados facilmente por outra família de produtos.  

## Estrutura do projeto
- **PCFactory** → Interface da fábrica abstrata.  
- **PCGamerFactory** e **PCOfficeFactory** → Fábricas concretas que criam combinações de CPU e GPU.  
- **CPU** e **GPU** → Interfaces que representam os produtos abstratos.  
- **CPUGamer**, **CPUOffice**, **GPUGamer**, **GPUOffice** → Produtos concretos, que implementam cada variante.  
- **PC** → Classe cliente que utiliza a fábrica para criar um computador sem conhecer diretamente as classes concretas.  

## Funcionamento
- Ao usar a `PCGamerFactory`, o sistema cria automaticamente uma **CPU Gamer** e uma **GPU Gamer**.  
- Ao usar a `PCOfficeFactory`, o sistema cria automaticamente uma **CPU Office** e uma **GPU Office**.  
- Assim, o cliente pode trocar facilmente entre diferentes famílias de produtos apenas mudando a fábrica utilizada.  

## Quando usar Abstract Factory
- Quando o sistema precisa ser **independente de como os produtos são criados**.  
- Quando deseja-se garantir que os objetos criados sejam **compatíveis entre si**.  
- Para facilitar a **troca de famílias de produtos** sem alterar o código cliente.  

## Como usar este projeto
Clone o repositório:
```bash
git clone https://github.com/devjuliomartins/padrao-abstract-factory.git
