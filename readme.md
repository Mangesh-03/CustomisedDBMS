# 💬 **CustomisedDBMS – A Custom In-Memory Java Database**

## 🎯 Overview

Customised DBMS is a lightweight Java-based in-memory DBMS built using Object-Oriented Programming and **Java Serialization**.
It simulates real DBMS functionalities including 
- Insert  
- Select  
- Delete  
- Search  
- persistent storage via backup and restore.
  

# 🚀 **Features**

### 🧱 Core DBMS Operations
- Insert employee record  
- Show all records (`SELECT *`)  
- Search by:
  - ID  
  - Name  
  - Salary  
  - Address  
- Delete record (ID / Name)  

### 💾 Backup & Restore
- One-click backup to `.ser` file  
- Restore previous backup on program start  

### 📦 In-Memory Storage
- Uses `LinkedList<Employee>`  
- Auto-increment employee ID  

### 🖥️ Menu-based CLI
Simple user interface for interacting with DBMS.

---

#  **UML Diagram**

```
+--------------------------------------------------------+
|                      Employee                          |
+--------------------------------------------------------+
| - EmpId: int                                           |
| - EmpName: String                                      |
| - EmpAge: int                                          |
| - EmpAddress: String                                   |
| - EmpSalary: int                                       |
| - static Counter: int                                  |
+--------------------------------------------------------+
| + Employee(name, age, addr, salary)                    |
| + toString(): String                                   |
+----------------------------^---------------------------+
                             |
+----------------------------|---------------------------+
|                      MangeshDBMS                      |
+--------------------------------------------------------+
| - Table: LinkedList<Employee>                         |
+--------------------------------------------------------+
| + InsertIntoTable()                                   |
| + SelectStarFrom()                                    |
| + SelectSpecificId()                                  |
| + SelectSpecificName()                                |
| + DeleteSpecificId()                                  |
| + DeleteSpecificName()                                |
| + SelectStarBySpecificSalary()                        |
| + SelectNameBySpecificAddress()                       |
| + TakeBackup()                                        |
| + RestoreBackup()                                     |
+--------------------------------------------------------+
                             ^
                             |
+----------------------------|---------------------------+
|                     CustomisedDBMS                    |
+--------------------------------------------------------+
| + main(): void                                         |
+--------------------------------------------------------+
```

## Work Flowchart

```

                     +----------------------+
                     |   Start Program      |
                     +----------+-----------+
                                |
                                v
                   +------------+--------------+
                   | Backup file provided?      |
                   +------+---------+-----------+
                          |         |
                         Yes       No
                          |         |
                          v         v
            +------------------+   +-------------------+
            | Restore Backup   |   | Create New DBMS   |
            +--------+---------+   +-------------------+
                     |                  |
                     v                  v
          +----------+-----------------------+
          | Display Main Menu (1–20)         |
          +-----------+----------------------+
                      |
                      v
       +--------------+------------------------------+
       |       User selects an operation             |
       +---------+-----------+-----------+-----------+
                 |           |           |
                 v           v           v
         Insert/Select     Delete      Backup
                 |           |           |
                 +-----------+-----------+
                             |
                             v
              +--------------+----------------+
              | Return to Menu (Until 20)     |
              +--------------+----------------+
                             |
                             v
                       +-----+------+
                       |   Exit     |
                       +------------+

```

---
## 📁 Project Structure

```
MangeshDBMS/
│
├── src/
│   ├── Employee.java
│   ├── MangeshDBMS.java
│   └── CustomisedDBMS.java
│
└── Readme.md

   
```

# 📄 **Documentation**

## **Class: Employee**
Represents an employee record.

| Field      | Type   | Description         |
|------------|--------|---------------------|
| EmpId      | int    | Auto-incremented id |
| EmpName    | String | Name                |
| EmpAge     | int    | Age                 |
| EmpAddress | String | Address             |
| EmpSalary  |int     | Salary              |

### Methods
- `toString()` → Returns formatted string  
- `DisplayInformation()` → Prints info  

---

## **Class: MangeshDBMS**

Main DBMS logic.

| Method                       | Description    |
|------------------------------|----------------|
| InsertIntoTable()            | Insert employee|
| SelectStarFrom()             | Show all       |
| SelectSpecificId()           | Search by ID   |
| SelectSpecificName()         | Search by name |
| DeleteSpecificId()           | Delete by ID   |
| DeleteSpecificName()         | Delete by name |
| SelectStarBySpecificSalary() | Filter salary  |
| SelectNameBySpecificAddress()| Filter address |
| TakeBackup()                 | Save database  |
| RestoreBackup()              | Load database  |

---

## **Class: CustomisedDBMS**
Handles CLI.

| Method | Description          |
|--------|----------------------|
| main() | Runs menu-based DBMS |

---

# 🚀 How to Run

### **Compile**
```bash
javac MangeshDBMS.java  Employee.java -d .
javac CustomisedDBMS.java
```

### **Run without backup**
```bash
java CustomisedDBMS
```

### **Run with backup**
```bash
java CustomisedDBMS MangeshDB.ser
```

---

# 📜 Menu Options

```
1  : Insert into Employee
2  : Select * from Employee
3  : Take backup
4  : Select by Employee ID
5  : Select by Employee Name
6  : Delete by Employee ID
7  : Delete by Employee Name
8  : Select by Salary
9  : Select by Address
..
Add more  query
..
..
20 : Exit
```

---

# 🛠️ Technologies Used

- **Java OOP**
- **Java Serialization**
- **Collections (LinkedList)**
- **Exception Handling**
- **File I/O**
- **CLI UI**

---

# 🎓 Learning Outcomes

This project helps understand:

✔ How a DBMS internally stores and retrieves records  
✔ How serialization stores Java objects on disk  
✔ Implementing CRUD logic  
✔ Building console-based applications  
✔ Using LinkedList for dynamic storage  

---

# 🔧 Possible Future Enhancements

- JSON-based backup  
- SQL-like query parser  
- Sorting operations  
- Update operation  
- GUI using Swing/JavaFX  

---
# 🤝 **Contributing Guidelines**

```
1. Fork the repository
2. Create a new branch
   git checkout -b feature-name
3. Commit your changes
   git commit -m "Added: feature description"
4. Push the branch
   git push origin feature-name
5. Create a Pull Request
```
<!-- ## 🔧 Prerequisites

### System Requirements
- **Java Runtime Environment**: JDK 8 or higher
- **Operating System**: Windows 10+, macOS 10.14+, or Linux (Ubuntu 18.04+)
- **Memory**: Minimum 128MB RAM
- **Network**: Local network or localhost for testing

### Development Tools
- **IDE**: IntelliJ IDEA, Eclipse, or Visual Studio Code
- **Build Tool**: Maven or Gradle (optional)
- **Version Control**: Git (recommended) -->



#  **Author**

**Mangesh Ashok Bedre**  













