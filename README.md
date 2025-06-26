# 🍨 Simple Spinner Android App (Kotlin)

This is a basic Android application that demonstrates how to use a **Spinner** (dropdown menu) in **Kotlin**. When a user selects an item from the dropdown, a `Toast` message displays the selected item.

---

## 🎯 Features

- Displays a list of ice cream flavors using a Spinner
- Shows a `Toast` message upon selecting an item
- Uses `ArrayAdapter` to bind the list to the Spinner

---

## 🧱 Built With

- Kotlin
- Android SDK
- Android Studio

---

## 📦 How It Works

1. An immutable list of ice cream flavors is created in `MainActivity.kt`.
2. A `Spinner` is defined in `activity_main.xml` with an `id` of `itemSpinner`.
3. An `ArrayAdapter` connects the data (list) to the Spinner.
4. The `onItemSelected()` method handles the item selection and displays a `Toast`.

---

## 💡 Example List

```kotlin
val listItems = listOf("Chocolate", "Strawberry", "Vanilla", "Mango")
---
When the user selects "Vanilla", a Toast message appears:
You have selected: Vanilla

📂 Project Structure
com.example.spinner/
├── MainActivity.kt        # Main logic and Spinner setup
└── res/
    └── layout/
        └── activity_main.xml  # Layout file with the Spinner
---
##🧪 How to Run
Clone this repository:

git clone https://github.com/yourusername/spinner-kotlin-app.git
Open the project in Android Studio.

Connect a device or use an emulator.

Click Run ▶️.

## 📄 License
This project is licensed under the MIT License.
