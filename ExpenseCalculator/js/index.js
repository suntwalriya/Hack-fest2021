const header = document.getElementById("headingAmount");
const inputAmount = document.getElementById("inputAmount");
const inputDesc = document.getElementById("inputDesc");
const expenseTable = document.getElementById("expenseTable");

let amount = 0;

const allExpenses = [];

//.textContent sends the information from js to DOM
header.textContent = amount;

function addExpense() {
  //.value takes the input from input field
  const expenseItem = {};
  const txtAmount = inputAmount.value;
  const txtDesc = inputDesc.value;

  //adding data in array
  expenseItem.amount = txtAmount;
  expenseItem.desc = txtDesc;
  allExpenses.push(expenseItem);
  console.clear();
  console.table(allExpenses);

  //showing result
  amount = amount + parseInt(txtAmount);
  let totalExpense = `Total Expense : ${amount}`;
  header.textContent = totalExpense;

  //showing data in the form of table
  let showAmountHTML = allExpenses.map((expense) => {
    return `<div>${expense.amount} :: ${expense.desc}</div>`;
  });

  //innerHTML doesnot include div while .textcontent show div
  expenseTable.innerHTML = showAmountHTML.join("");
}

const btn = document.getElementById("btn");
btn.addEventListener("click", addExpense, false);
