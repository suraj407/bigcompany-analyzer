# 🚀 BigCompany Analyzer

BigCompany Analyzer is a Java application that analyzes an organization's employee data to ensure salary fairness and reporting hierarchy constraints.

## 📌 Problem Statement
A company wants to:
1. Ensure every **manager** earns at least **20% more** than the average salary of their direct subordinates but no more than **50% more**.
2. Identify **managers who are underpaid/overpaid** based on the above condition.
3. Identify **employees who have more than 4 managers** between them and the **CEO**.

## ⚙️ Features
✅ Reads employee data from a **CSV file**.  
✅ Identifies **underpaid/overpaid managers**.  
✅ Detects **excessively long reporting chains**.  
✅ Outputs the analysis in the **console**.

## 🛠️ Tech Stack
- **Java SE 23**
- **Maven** (for project management)
- **JUnit** (for unit testing)
- **CSV File Handling** (for data input)

## 📜 Input CSV Format
The input CSV file `employees.csv` contains the sample data and format

### 📌 Assumptions
1. The **CEO** has no manager (`NULL` in the Manager ID column).
2. Each employee has **at most one direct manager**.
3. The salary constraints apply only to **managers** who have direct reports.

---

## 🚀 How to Run the Application
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/suraj407/bigcompany-analyzer.git
cd bigcompany-analyzer
