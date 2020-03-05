#include<iostream>
#include"Product.h"
#include<cstring>
using namespace std;
int otherSKU = 0;
Product::Product()
{
	setSKU();
	Brand = new char[1];
	Brand = '\0';
	Model = new char[1];
	Model = '\0';
	Category = new char[1];
	Category = '\0';
	setPrice(0);
	setCount(0);
}
Product::Product(const char* Brand, const char* Model, const char* Category, double Price, int Count)
{
	setSKU();
	setBrand(Brand);
	setModel(Model);
	setCategory(Category);
	setPrice(Price);
	setCount(Count);
}
Product::Product(const Product& other)
{
	setSKU();
	setBrand(other.Brand);
	setModel(other.Model);
	setCategory(other.Category);
	setPrice(other.Price);
	setCount(other.Count);
}
Product & Product::operator=(const Product & other)
{
	if (this != &other)
	{
		SKU = other.SKU;
		setBrand(other.Brand);
		setModel(other.Model);
		setCategory(other.Category);
		setPrice(other.Price);
		setCount(other.Count);
	}
	return*this;
}
void Product::setSKU()
{
	SKU = otherSKU;
	otherSKU++;
}
void Product::setBrand(const char* Brand)
{
	this->Brand = new char[strlen(Brand) + 1];
	strcpy_s(this->Brand, strlen(Brand) + 1, Brand);
}
void Product::setModel(const char* Model)
{
	this->Model = new char[strlen(Model) + 1];
	strcpy_s(this->Model, strlen(Model) + 1, Model);
}
void Product::setCategory(const char* Category)
{
	this->Category = new char[strlen(Category) + 1];
	strcpy_s(this->Category, strlen(Category) + 1, Category);
}
void Product::setPrice(double otherPrice)
{
	Price = otherPrice;
}
void Product::setCount(int otherCount)
{
	Count = otherCount;
}
int Product::getSKU() const
{
	return this->SKU;
}
char* Product::getBrand() const
{
	return this->Brand;
}
char* Product::getModel() const
{
	return this->Model;
}
char* Product::getCategory() const
{
	return this->Category;
}
double Product::getPrice() const
{
	return this->Price;
}
int Product::getCount() const
{
	return this->Count;
}
void Product::print()
{
	cout << "The SKU of the product-> " << getSKU() << endl;
	cout << "The brand of the product-> " << getBrand() << endl;
	cout << "The model of the product-> " << getModel() << endl;
	cout << "The category of the product-> " << getCategory() << endl;
	cout << "The price of the product-> " << getPrice() << endl;
	cout << "The amount of the product-> " << getCount() << endl;
}
Product::~Product()
{
	delete[] Brand;
	delete[] Model;
	delete[] Category;
}