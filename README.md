# PFSWCHO-zad1

## Polecenie 3: 

### a. zbudowania opracowanego obrazu kontenera
  ```
  docker build --tag=demo:latest . 
  ```
### b. uruchomienia kontenera na podstawie zbudowanego obrazu
  ```
  docker run -p8080:8081 demo:latest
  ```
### c. sposobu uzyskania informacji, które wygenerował serwer w trakcie uruchamiana kontenera (patrz: punkt 1a)
Logi są przekierowane do terminalu podczas uruchamiania kontenera. Ip oraz obecną datę można zobaczyć po otworzeniu adresu http://localhost:8080/main
![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/2ac52b88-9d83-418e-be41-016e62644534)
![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/24ab763a-3869-4231-9ca3-0a3c72358898)
### d. sprawdzenia, ile warstw posiada zbudowany obraz.
```
docker image inspect demo
```
Wynik wykonania polecenia
![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/3d0e3c99-9e2a-4fff-ba55-c29e5f0a7ca5)

# PFSWCHO-zad2

## Polecenie 1: 

Plik konfiguracyjny łańcucha github actions znajduje się pod ścieżką .github/workflows/gha_zad2.yml. Buduje on obraz opracowany w poprzednim zadaniu na architektury linux/arm64/v8 oraz
linux/amd64

Zrzut ekranu przedstawiający udane wykonanie łańcucha 
![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/6b63e880-a8b3-4e66-a5ba-3d54c51c3f84)

Zrzut ekranu przedstawiający obraz, który został zbudowany i przesłany na repozytorium dockerhub przez łańcuch, w sekcji OS/ARCH możemy zobaczyć obie architektury, na które miał zostać zbudowany do wyboru

![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/2ea61462-b6e9-4e77-a3c3-e2e69605485c)
