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

## Polecenie dodatkowe

Plik konfiguracyjny łańcucha github actions wdrażający aplikacje przy użyciu aws beanstalk znajduje się pod ścieżką .github/workflows/deploy_template.yml. 

W celu uruchamiania łańcucha został stworzony specjalny użytkownik IAM wraz z kluczaem dostępowym.

Zrzut ekranu z obrazem zbudowanym i przesłanym na dockerhub przez github action 
![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/3d343579-2c1c-40e9-8775-638c6a1c241f)

Zrzut ekranu z udanego uruchomienia github action
![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/6bbb809c-a36e-4e4c-8d23-9345ba067bf7)

Zrzut ekranu działającej aplikacji w konsoli AWS 
![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/80363098-89ec-423c-bca2-94a0c4e898f6)

Zrzut ekranu działającej aplikacji

![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/0618e9d7-9391-485b-a778-84a1a6c0fe99)

Zrzut ekranu z usługi S3 zawierającej paczkę zbudowaną przez github actions 

![image](https://github.com/Cz4pek/PFSWCHO-zad1/assets/61994338/c257c4ea-5051-4a5e-98c7-7b1332c76427)
