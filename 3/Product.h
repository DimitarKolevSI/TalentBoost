#pragma once
class Product //laptop
{
private:
	int SKU;
	char* Brand;
	char* Model;
	char* Category;
	double Price;
	int Count;
public:
	Product();
	Product(const char*, const char*, const char*, double, int);
	Product(const Product&);
	Product& operator=(const Product&);
	void print();
	void setSKU();
	void setBrand(const char*);
	void setModel(const char*);
	void setCategory(const char*);
	void setPrice(double);
	void setCount(int);
	int getSKU() const;
	char* getBrand() const;
	char* getModel() const;
	char* getCategory() const;
	double getPrice() const;
	int getCount() const;
	~Product();
};
