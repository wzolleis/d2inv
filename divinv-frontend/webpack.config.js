// const webpack = require('webpack');
const path = require('path');
const CopyPlugin = require('copy-webpack-plugin');
// const MiniCssExtractPlugin = require('mini-css-extract-plugin')
// const HtmlWebpackPlugin = require("html-webpack-plugin");

const config = {
    entry: './src/index.tsx',
    output: {
        path: path.resolve(__dirname, 'build'),
        filename: 'bundle.js'
    },
    devServer: {
        contentBase: path.join(__dirname, 'build'),
        compress: true,
        port: 9000,
    },
    devtool: 'inline-source-map',
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                use: 'babel-loader',
                exclude: /node_modules/
            },
            {
                test: /\.ts(x)?$/,
                loader: 'ts-loader',
                exclude: /node_modules/
            },
            {
                test: /\.scss$/,
                use: ["style-loader", "css-loader", "sass-loader"]
            },
        ]
    },
    plugins: [
        new CopyPlugin({
            patterns: [{from: 'public/index.html'}],
        }),
    ],
    resolve: {
        extensions: [
            '.js',
            '.jsx',
            '.tsx',
            '.ts',
            '.scss'
        ]
    }
};

module.exports = config;