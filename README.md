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
