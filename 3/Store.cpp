#include<iostream>
#include"Store.h"
using namespace std;
Store::Store()
{
	NumberOfProducts = 1;
	CurrentProducts = 0;
	Products = new Product[NumberOfProducts];
}
Store::Store(const Store & copy)
{
	NumberOfProducts = copy.NumberOfProducts;
	CurrentProducts = copy.CurrentProducts;
	Products = new Product[NumberOfProducts];
	for (int i = 0; i < CurrentProducts; i++) Products[i] = copy.Products[i];
}
void Store::Add()
{
	Product temp;
	if (CurrentProducts == NumberOfProducts) resize();
	int Lenght;
	cout << "The Lenght of the brand-> ";
	cin >> Lenght;
	char* Brand = new char[Lenght + 1];
	cin.ignore();
	cin.getline(Brand, Lenght + 1);
	temp.setBrand(Brand);
	cout << "The Lenght of the model-> ";
	cin >> Lenght;
	char* Model = new char[Lenght + 1];
	cin.ignore();
	cin.getline(Model, Lenght + 1);
	temp.setModel(Model);
	cout << "The Lenght of the category-> ";
	cin >> Lenght;
	char* Category = new char[Lenght + 1];
	cin.ignore();
	cin.getline(Category, Lenght + 1);
	temp.setCategory(Category);
	double price;
	cout << "The price of the product-> ";
	cin >> price;
	temp.setPrice(price);
	cout << "The amount of the product in stock-> ";
	cin >> Lenght;
	temp.setCount(Lenght);
	Products[CurrentProducts] = temp;
	CurrentProducts++;
}
void Store::Print()
{
	if (CurrentProducts == 0) cout << "There are no products in the store!" << endl;
	else
	{
		for (int i = 0; i < CurrentProducts; i++)
		{
			cout << "The SKU of the laptop-> " << Products[i].getSKU() << endl;
			cout << "The brand of the laptop-> " << Products[i].getBrand() << endl;
			cout << "The model of the laptop-> " << Products[i].getModel() << endl;
			cout << "The category of the laptop-> " << Products[i].getCategory() << endl;
			cout << "The price of the laptop-> " << Products[i].getPrice() << endl;
			cout << "The amount of the product in stock-> " << Products[i].getCount() << endl << endl;
		}
	}
}
bool Store::Delete(int IndexOfDeletedProduct)
{
	if (IndexOfDeletedProduct > CurrentProducts) return false;
	else
	{
		Product* other = new Product[CurrentProducts - 1];
		int j = 0;
		for (int i = 0; i < CurrentProducts; i++)
		{
			if (i != IndexOfDeletedProduct)
			{
				other[j] = Products[i];
				j++;
			}
		}
		delete[] Products;
		CurrentProducts--;
		Products = new Product[CurrentProducts];
		Products = other;
		return true;
	}
}
bool Store::Change(int IndexOfChangedProduct)
{
	if (IndexOfChangedProduct >= CurrentProducts) return false;
	else
	{
		int Lenght;
		cout << "The Lenght of the brand for the new product-> ";
		cin >> Lenght;
		char* Brand = new char[Lenght + 1];
		cin.ignore();
		cin.getline(Brand, Lenght + 1);
		Products[IndexOfChangedProduct].setBrand(Brand);
		delete[] Brand;
		cout << "The Lenght of the model for the new product-> ";
		cin >> Lenght;
		char* Model = new char[Lenght + 1];
		cin.ignore();
		cin.getline(Model, Lenght + 1);
		Products[IndexOfChangedProduct].setModel(Model);
		delete[] Model;
		cout << "The Lenght of the category for the new product-> ";
		cin >> Lenght;
		char* Category = new char[Lenght + 1];
		cin.ignore();
		cin.getline(Category, Lenght + 1);
		Products[IndexOfChangedProduct].setCategory(Category);
		delete[] Category;
		double price;
		cout << "The price of the new product-> ";
		cin >> price;
		Products[IndexOfChangedProduct].setPrice(price);
		cout << "The amount of the new product in stock-> ";
		cin >> Lenght;
		Products[IndexOfChangedProduct].setCount(Lenght);
		return true;
	}
}
void Store::resize()
{
	Product* TempProduct = new Product[NumberOfProducts*2];
	for (int i = 0; i < CurrentProducts; i++)
	{
		TempProduct[i] = Products[i];
	}
	NumberOfProducts *= 2;
	delete[] Products;
	Products = TempProduct;
}
Store::~Store()
{
	delete[] Products;
}