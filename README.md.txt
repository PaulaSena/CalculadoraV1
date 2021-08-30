# CRIANDO CALCULADORA

# Primeiro projetinho em Android com KOTLIN

### Realizar uma calculadora que receba 2 notas e a quantidade de faltas do aluno.

- n1
- n2
- media(n1+n2) ≥6
- falta ≤10
- btnCalcular

![Untitled](img/Untitled.png)

- Selecione o Empty Activity

![Untitled](img/Untitled%201.png)

- Nome do Projeto
- Linguagem a ser utilizada
- Selecione a API mais utilizada

![Untitled](img/Untitled%202.png)

### No arquivo **activity_main.xm**l

Apague o <TexrtView que exibe Hello Word

![Untitled](img/Untitled%203.png)

Clique em Design

- Palette

       - Text 

          - Plain Text  - Selecione e arraste para o emulador de Design.

 

![Untitled](img/Untitled%204.png)

### Realizar a ligação com Constrant Layout

![Untitled](img/Untitled%205.png)

### Inserindo um Atributo

- hint "Insira a primeira nota"

![Untitled](img/Untitled%206.png)

![Untitled](img/Untitled%207.png)

![Untitled](img/Untitled%208.png)

![Untitled](img/Untitled%209.png)

Adicionando Atributos de elementos

![Untitled](img/Untitled%2010.png)

Inserindo (Espaço interno) Paddin  20**dp**

![Untitled](img/Untitled%2011.png)

![Untitled](img/Untitled%2012.png)

![Untitled](img/Untitled%2013.png)

Rodando no Emulador

![Untitled](img/Untitled%2014.png)

![Untitled](img/Untitled%2015.png)

![Untitled](img/Untitled%2016.png)

```

<EditText
    android:id="@+id/editTextTextPersonName1"
    android:layout_width="224dp"
    android:layout_height="62dp"
    android:layout_marginTop="104dp"
    android:background="@color/purple_200"
    android:ems="10"
    android:fontFamily="sans-serif-medium"
    android:hint=" Insira sua nota"
    android:inputType="textPersonName"
    android:padding="20dp"
    android:textSize="20sp"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.497"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" />

<EditText
    android:id="@+id/editTextTextPersonName2"
    android:layout_width="224dp"
    android:layout_height="62dp"
    android:layout_marginTop="36dp"
    android:background="@color/purple_200"
    android:ems="10"
    android:fontFamily="sans-serif-medium"
    android:hint=" Insira sua nota"
    android:inputType="textPersonName"
    android:padding="20dp"
    android:textSize="20sp"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.497"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@+id/editTextTextPersonName1" />

<EditText
    android:id="@+id/editTextTextPersonName3"
    android:layout_width="224dp"
    android:layout_height="62dp"
    android:layout_marginTop="40dp"
    android:background="@color/purple_200"
    android:ems="10"
    android:fontFamily="sans-serif-medium"
    android:hint=" Insira suas faltas"
    android:inputType="textPersonName"
    android:padding="20dp"
    android:textSize="20sp"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.497"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@+id/editTextTextPersonName2" />
```

# Sucesso 😍 Part 1

# Adicionando o Botão

Em Palette selecione Buttons e Buton

![Untitled](img/Untitled%2017.png)

### para deixar o botao

![Untitled](img/Untitled%2018.png)

```
<Button
    android:id="@+id/button"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="100dp"
    android:scrollHorizontally="false"
    android:textColor="@color/preto"
    android:text="CALCULAR"
    app:backgroundTint="@android:color/holo_red_light"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.468"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@+id/editTextTextPersonName3" />
```

## Alterando Cores em Colors.xml

![Untitled](img/Untitled%2019.png)

```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
    <color name="preto">#FF000000</color>
</resources>
```

## Desenvolvendo a MainActivity

![Untitled](img/Untitled%2020.png)

### Corrigindo botão

![Untitled](img/Untitled%2021.png)

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/button"
        android:layout_width="407dp"
        android:layout_height="65dp"
        android:layout_marginTop="56dp"
        android:text="CALCULAR"
        android:textColor="@color/preto"
        app:backgroundTint="@android:color/holo_red_light"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextTextPersonName3" />

    <EditText
        android:id="@+id/editTextTextPersonName3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:background="@color/purple_200"
        android:ems="10"
        android:fontFamily="sans-serif-medium"
        android:hint=" Insira suas faltas"
        android:inputType="textPersonName"
        android:padding="20dp"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextTextPersonName2" />

    <EditText
        android:id="@+id/editTextTextPersonName1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="132dp"
        android:background="@color/purple_200"
        android:ems="10"
        android:fontFamily="sans-serif-medium"
        android:hint=" Insira sua nota"
        android:inputType="textPersonName"
        android:padding="20dp"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/editTextTextPersonName2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:background="@color/purple_200"
        android:ems="10"
        android:fontFamily="sans-serif-medium"
        android:hint=" Insira sua nota"
        android:inputType="textPersonName"
        android:padding="20dp"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextTextPersonName1" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

# <String> Criando um campo String.

![Untitled](img/Untitled%2022.png)

![Untitled](img/Untitled%2023.png)

![Untitled](img/Untitled%2024.png)

# TextView com if else

![Untitled](img/Untitled%2025.png)

### Centralizando texto Gravity

![Untitled](img/Untitled%2026.png)

### Tamanho da Letra Size

![Untitled](img/Untitled%2027.png)

### Chamando os campos por ID

![Untitled](img/Untitled%2028.png)

![Untitled](img/Untitled%2029.png)

Romeado os campos ID

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/nota"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/n1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="132dp"
        android:background="@color/purple_200"
        android:ems="10"
        android:fontFamily="sans-serif-medium"
        android:hint=" Insira sua nota1"
        android:inputType="textPersonName"
        android:padding="20dp"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/nota" />

    <EditText
        android:id="@+id/n2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:background="@color/purple_200"
        android:ems="10"
        android:fontFamily="sans-serif-medium"
        android:hint=" Insira sua nota2"
        android:inputType="textPersonName"
        android:padding="20dp"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/n1" />

    <EditText
        android:id="@+id/falta"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:background="@color/purple_200"
        android:ems="10"
        android:fontFamily="sans-serif-medium"
        android:hint=" Insira suas faltas"
        android:inputType="textPersonName"
        android:padding="20dp"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/n2" />

    <Button
        android:id="@+id/btnCalcular"
        android:layout_width="407dp"
        android:layout_height="65dp"
        android:layout_marginTop="56dp"
        android:text="@string/Calcular"
        android:textColor="@color/preto"
        app:backgroundTint="@android:color/holo_red_light"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/falta" />

    <TextView
        android:id="@+id/resultado"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="92dp"
        android:gravity="center"
        android:text="Aqui sera if else para exibir msg"
        android:textSize="24sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btnCalcular" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

# Add plugin | Build.grandle module  .app

 

![Untitled](img/Untitled%2030.png)

id 'kotlin-android-extensions'

![Untitled](img/Untitled%2031.png)

Alt+ Enter

![Untitled](img/Untitled%2032.png)

![Untitled](img/Untitled%2033.png)

# Criando Evento

btnCalcular.setOnClickListener {Execulte isso aqui ao clicar}

```
package com.example.calculadorav1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = btnCalcular
        val resultado = resultado

        btnCalcular.setOnClickListener{
val n1: Int = Integer.parseInt(n1.text.toString())
            val n2: Int = Integer.parseInt(n2.text.toString())
            val total: Int = (n1 + n2)
            val media: Int = total / 2
            val falta: Int = Integer.parseInt(falta.text.toString())

            if (media >= 6 && falta <= 10) {
                resultado.setText("Parabéns foi aprovado!!" + "\n" + "Nota Final: $total" + "\n" + "Média: $media" + "\n" + "Faltas: $falta ")
            }else{
                resultado.setText("Precisa estudar mais esta reprovado!!" + "\n" + "Nota Final: $total" + "\n" + "Media: $media" + "\n" + "Faltas: $falta ")
            }

}
}
}
```

## Implementando condicionais

```
resultado.setTextColor(Color.RED)
```

```
package com.example.calculadorav1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = btnCalcular
        val resultado = resultado

        btnCalcular.setOnClickListener{
val n1: Int = Integer.parseInt(n1.text.toString())
            val n2: Int = Integer.parseInt(n2.text.toString())
            val total: Int = (n1 + n2)
            val media: Int = total / 2
            val falta: Int = Integer.parseInt(falta.text.toString())

            if (media >= 6 && falta <= 10) {
                resultado.setText("Parabéns foi aprovado!!\n Nota Final: $total\n Média: $media\n Faltas: $falta")
                resultado.setTextColor(Color.GREEN)

            }else{
                resultado.setText("Precisa estudar mais esta reprovado!! \n Nota Final: $total \n Media: $media\n Faltas: $falta")
                resultado.setTextColor(Color.RED)
            }

				}
		}
}
```

![Untitled](img/Untitled%2034.png)

![Untitled](img/Untitled%2035.png)

![Untitled](img/Untitled%2036.png)

# Sucesso 😎