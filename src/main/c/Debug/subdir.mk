################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../com_healthme_jni_ECGInterface.cpp 

OBJS += \
./com_healthme_jni_ECGInterface.o 

CPP_DEPS += \
./com_healthme_jni_ECGInterface.d 


# Each subdirectory must supply rules for building sources it contributes
%.o: ../%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -I/home/guiwen/jdk1.7.0_45/include -I/home/guiwen/jdk1.7.0_45/include/linux -O0 -g3 -Wall -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


