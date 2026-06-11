# Coursera: Programa especializado: Desarrollo de aplicaciones móviles con Android

## Curso 3 - Module 6

**AGREGANDO MENÚS**
  
| Prototipos | Descripción |
|-----------|-----------|
| <img width="357" height="680" alt="image" src="https://github.com/user-attachments/assets/62bdefde-d501-4628-b1b9-2b467e2cfd04" /> | **AGREGANDO MENÚS**: Crea un menú de opciones que muestre el Item “Contacto” y el Item “Acerca De”. <br> <br> **Contacto** deberá: <br> - Llevarte a una pantalla con un formulario en el que solicites el nombre, el correo y su mensaje (utiliza los EditText de Material Design) <br> - Además habrá un botón de “Enviar Comentario” el cual tomará la información recopilada y con ayuda de la librería JavaMail envíe un mail con el comentario del contacto. <br> <br> **Acerca De**, deberá llevarte a una pantalla con la Bio del desarrollador.|

**FRAGMENTS**

| Prototipos | Descripción |
|-----------|-----------|
| <img width="242" height="460" alt="image" src="https://github.com/user-attachments/assets/7516c962-cbac-410a-a6c5-2527f1f2da75" /> <br> <img width="242" height="460" alt="image" src="https://github.com/user-attachments/assets/556bce13-11e0-4975-bd7e-efb1f8e902aa" /> | **FRAGMENTS** <br> <br> A partir de la siguiente imagen de maqueta: <br> <br> 1. Modulariza el proyecto anterior en Fragments para que estos puedan ser mostrados en un ViewPager. <br> <br> 2. Crea un Fragment Adicional que muestre el perfil de nuestra mascota. Tendrá su foto de perfil, su nombre y un RecyclerView en donde se mostrarán todas las fotos que ha subido se acomodarán en forma de Grid. <br> <br> 3. Cada ítem deberá contener la foto y la cantidad de raits que se le han dado representado por huesos. Recuerda que todos los datos son dummy. |

### Criterios de Evaluación
1. Que tu aplicación muestre los dos menús solicitados
2. Que ambos menús funcionen correctamente
3. Libreria JavaMail
4. Que corra la aplicación
5. View Pager
6. Modularizacion en Fragments
7.Librería implementada

## Evidencias
4. Que corra la aplicación
   
[Course3.Module6.webm](https://github.com/user-attachments/assets/80d79dd7-c2e4-49c1-8674-98a60b4cefbd)


| 1. Que tu aplicación muestre los dos menús solicitados | 2. Que ambos menús funcionen correctamente | 3. Libreria JavaMail |
|-----------|-----------|-----------|
| <img width="566" height="937" alt="image" src="https://github.com/user-attachments/assets/0fbfdc81-a97d-4248-b930-b3e8c0a87f07" /> | <img width="562" height="933" alt="image" src="https://github.com/user-attachments/assets/b7496ed5-97e6-4ae7-b74a-e2ee50d508b4" /> <br> <img width="562" height="933" alt="image" src="https://github.com/user-attachments/assets/dc50e69e-9ec3-4a3e-b267-f61ec7d023ec" /> | <img width="806" height="845" alt="image" src="https://github.com/user-attachments/assets/54128578-8f66-492c-98c1-9fb7795e8847" /> |

| 5. View Pager | 6. Modularizacion en Fragments | 7.Librería implementada |
|-----------|-----------|-----------|
| <img width="1221" height="772" alt="image" src="https://github.com/user-attachments/assets/464148dc-f9d0-4af1-8dcd-be5aac3808c5" /> | <img width="562" height="928" alt="image" src="https://github.com/user-attachments/assets/fa2194ae-4688-463b-a1a0-f036f58f4929" /> <br> <img width="560" height="931" alt="image" src="https://github.com/user-attachments/assets/8cd9ba6c-79ab-4964-8fbe-afc208f30070" /> | <img width="1526" height="921" alt="image" src="https://github.com/user-attachments/assets/656bff15-e389-477f-8f49-6ac7ae11388b" /> |

## Notas
- Para enviar el correo de contacto se debe generar la contraseña de aplicacion del correo que uses y lo configures en la clase EmailSender.
  
<img width="1122" height="156" alt="image" src="https://github.com/user-attachments/assets/97df9373-7d9e-4f7f-9df0-0562056bac7e" />

- La lista de favoritos se basa en las 5 mascotas con mas rating.
- Ahora la función de favorito es la función de raiting el cual aumenta si se presiona.
- Version de Android Studio: Android Studio Narwhal | 2025.1.1
