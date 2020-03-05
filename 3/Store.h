#pragma once
#include"Product.h"
class Store
{
private:
	int NumberOfProducts;
	int CurrentProducts;
	Product* Products;
	void resize();
public:
	Store();
	Store(const Store&);
	void Add();
	void Print();
	bool Delete(int);
	bool Change(int);
	~Store();
};
