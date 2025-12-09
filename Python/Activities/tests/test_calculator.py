import pytest

@pytest.mark.parametrize("num1,num2",[(2,3),(8,9),(9,0)])
def test_sum(num1,num2):
    sum=num1+num2
    assert num1+num2==sum

@pytest.mark.parametrize("num1,num2",[(2,3),(8,9),(9,0)])
def test_difference(num1,num2):
    difference=num1-num2
    assert num1-num2==difference

@pytest.mark.activity
@pytest.mark.parametrize("num1,num2",[(2,3),(8,9),(9,0)])
def test_product(num1,num2):
    product=num1*num2
    assert num1*num2==product

@pytest.mark.activity
@pytest.mark.parametrize("num1,num2",[(2,3),(8,9),(9,1)])
def test_quotient(num1,num2):
    quotient=num1/num2
    assert num1/num2==quotient