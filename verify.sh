#!/bin/bash

BASE_URL="http://localhost:8080/api"

echo "1. Creating a new Book..."
curl -X POST "$BASE_URL/books" \
  -H "Content-Type: application/json" \
  -d '{
    "title": "The Great Gatsby",
    "author": "F. Scott Fitzgerald",
    "isbn": "978-0743273565"
  }'
echo -e "\n"

echo "2. Creating a new Patron..."
curl -X POST "$BASE_URL/patrons" \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Jane Doe",
    "email": "jane.doe@example.com"
  }'
echo -e "\n"

echo "3. Creating a Loan (Book ID 1, Patron ID 1)..."
curl -X POST "$BASE_URL/loans?bookId=1&patronId=1"
echo -e "\n"

echo "4. Getting Active Loans..."
curl -X GET "$BASE_URL/loans/active"
echo -e "\n"

echo "5. Getting Loans for Patron 1..."
curl -X GET "$BASE_URL/patrons/1/loans"
echo -e "\n"

echo "6. Returning Loan 1..."
curl -X PUT "$BASE_URL/loans/1/return"
echo -e "\n"

echo "7. Getting Active Loans (should be empty if only one loan existed)..."
curl -X GET "$BASE_URL/loans/active"
echo -e "\n"
