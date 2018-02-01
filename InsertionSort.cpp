/**--------------------------------------
    Author: Nikhil Hegde
    Code  : C++ code for insertion Sort
----------------------------------------*/
#include<iostream>
using namespace std;

void InsertionSort(int *arr,int length)
{
    int i,h,value;

    for(i=1;i<length;i++)
    {
        value=arr[i];
        h=i;

        while( h > 0 && arr[h-1] >= value )
        {
            arr[h]=arr[h-1];
            h--;
        }
        arr[h]=value;
    }
}
int main()
{
    int arr[20];
    int length;
    int i;
    cout<<"--Insertion Sort Code--"<<endl;
    cout<<"Enter the number of elements: ";
    cin>>length;
    cout<<"Enter the "<<length<<" elements in one line with space and \n hit enter at the end "<<endl;

    for(i=0;i<length;i++)
    {
        cin>>arr[i];
    }
    InsertionSort(arr,length);
    cout<<"--Elements  after sorting---"<<endl;
    for(i=0;i<length;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;
}
