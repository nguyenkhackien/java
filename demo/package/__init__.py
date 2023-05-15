import cv2
import numpy as np
import scipy

print(cv2.__version__)

#g = np.ones((3, 3))
g = np.array([[1. for _ in range(5)] for _ in range(5)])
identity = np.zeros((5, 5))
identity[2][2] = 1
#print(g, g.dtype)

g /= 25
g = identity - g
print(g)

img = cv2.imread('test.jpg', 0)
print(img.shape)

output = scipy.signal.convolve2d(img, g)
cv2.imshow('TestRGB', img)
cv2.imshow('Output', output)
#cv2.imshow('Test channel 1', img[:,:,1])
cv2.waitKey()
1
