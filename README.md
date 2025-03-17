# UserAuth Servlet Project

## 🔒 Secure User Authentication System with Java Servlets

Welcome to the **UserAuth Servlet Project**, a web-based authentication system built using Java Servlets. This project provides user registration, login, and session management features, ensuring secure access control.

## 🚀 Features

- **User Registration** 📋: New users can sign up securely.
- **Login System** 🔑: Authenticate users with username(email) and password.
- **Session Management** ⏳: Maintain user sessions after login.
- **Logout Functionality** 🚪: Securely terminate user sessions.
- **Input Validation** 🛡️: Prevent invalid data entry.
- **Security Enhancements** 🔐: Password hashing and secure session handling.

## 🛠️ Technologies Used

- **Backend:** Java Servlets, JDBC
- **Frontend:** HTML
- **Database:** Oracle (JDBC Connectivity)
- **Tools:** Apache Tomcat, Eclipse, Git

## 📂 Project Structure

`
UserAuthServlet/
│── src/
│   ├── com.siddique.servlet (Servlets for Login, Register, Logout)
│   ├── com.siddique.dao (Database operations)
│── WebContent/
│   ├── pages/ (Login, Register, Home pages)
│   ├── WEB-INF/web.xml (Deployment Descriptor)
│── database.sql (DB setup script)
│── README.md
`

## 🏗️ Setup Instructions

1. **Clone the repository:**
   
   git clone https://github.com/yourusername/userauth-servlet.git
 
2. **Import the project into Eclipse/VS Code.**
3. **Configure the database:** Import `database.sql` into Oracle.
4. **Update database credentials** in `com.siddique.dao.DBConnection`.
5. **Deploy on Tomcat Server** and run the application.


## 🤝 Contribution

Feel free to fork and contribute! Open issues and PRs are welcome. 😊

## 📜 License

This project is licensed under the MIT License.

---

⭐ **Star this repo if you found it useful!** ⭐

