import pytest


def test_sum(list):
    sum=0
    for i in list:
        sum+=i
    assert sum==55