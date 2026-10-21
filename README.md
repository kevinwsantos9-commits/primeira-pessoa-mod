# Nivek First Person

Projeto inicial para Minecraft **1.21.1 + Fabric + Java 21**.

## Estado atual

Esta é somente a base de compilação e carregamento do mod. Ela **ainda não implementa** a renderização das pernas nem as animações aprimoradas; isso exige código específico de renderização/mixins e testes dentro do Minecraft. Não instale esperando essas funções nesta versão 0.1.0.

## Compilar localmente

1. Instale o JDK 21.
2. Instale Gradle 8.10.2 (mesma versão usada no GitHub Actions).
3. Abra um terminal nesta pasta e execute:

   ```bash
   gradle build
   ```

4. O arquivo compilado ficará em `build/libs/`.

## Compilar pelo GitHub Actions

1. Crie um repositório no GitHub.
2. Envie todos os arquivos desta pasta para o repositório.
3. Abra a aba **Actions** e selecione **Build Nivek First Person**.
4. Quando a execução terminar com sucesso, abra a execução e baixe o artefato `nivek-first-person-1.21.1` na seção **Artifacts**.

O artefato é um ZIP com o JAR do mod (sem o `-sources`). Para instalar, copie o JAR para a pasta `mods` do perfil Fabric do Minecraft 1.21.1.

## Requisitos para rodar

- Minecraft 1.21.1 com [Fabric Loader](https://fabricmc.net/use/) 0.16.0 ou mais recente
- [Fabric API](https://modrinth.com/mod/fabric-api) para 1.21.1
- Java 21

## Licença

MIT. Veja o arquivo `LICENSE`.
